import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class test02  implements Watcher {
    private static final String  Assd="192.168.204.128:2181,192.168.204.128:2182";
    private static final int  time=3000;
    //信号量让zk连接之前等待连接成功后在继续往下走
    ZooKeeper zooKeeper;
 private static final CountDownLatch c=new CountDownLatch(1);
 public void create(String assd,int time){
     try {
        zooKeeper = new ZooKeeper(assd, time, this);
         System.out.println("服务器已启动。。。。");
         c.await();
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
 public Stat exisd(String assd,boolean watch){
     try {
         return this.zooKeeper.exists(assd,watch);
     } catch (KeeperException e) {
         e.printStackTrace();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     return null;
 }

    //创建节点
    public   boolean     createPath(String  path,String data){
        try {
            //exists(path,true);
            this.zooKeeper.create(path,data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println("节点创建成功：path"+path+" data"+data);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return   false;
        }
        return true;
    }


    public boolean updateNode(String path,String data) {
        exisd(path, true);
        try {
            this.zooKeeper.setData(path, data.getBytes(), -1);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delet(String path) {
        exisd(path, true);
        try {
            this.zooKeeper.delete(path,-1);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void process(WatchedEvent watchedEvent) {
        //事件状态
        // 获取事件状态
        Event.KeeperState keeperState = watchedEvent.getState();
        // 获取事件类型
        Event.EventType eventType = watchedEvent.getType();
        //事件类型
        // zk 路径
        String path = watchedEvent.getPath();
        Event.EventType type = watchedEvent.getType();
        if (Event.KeeperState.SyncConnected == keeperState) {
            if (Event.EventType.None == eventType) {
                // 如果建立建立成功,让后程序往下走
                System.out.println("zk 建立连接成功!");
                c.countDown();
            } else if (Event.EventType.NodeCreated== eventType) {
                System.out.println( "事件通知,新增node节点" + path);
            } else if (Event.EventType.NodeDataChanged == eventType) {
                System.out.println( "事件通知,当前node节点" + path + "被修改....");
            }
            else if (Event.EventType.NodeDeleted == eventType) {
                System.out.println( "事件通知,当前node节点" + path + "被删除....");
            }

        }
    }

    public static void main(String[] args) {
        test02 demoTest02=new test02();
        demoTest02.create(Assd,time);
        demoTest02.createPath("/user/ss","123123");
        // demoTest02.updateNode("/admin5","43543");
        demoTest02.delet("/user");
    }


}

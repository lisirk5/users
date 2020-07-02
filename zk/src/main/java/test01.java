import org.apache.zookeeper.*;

import java.io.IOException;

public class test01 {
    //设置连接地址
    private static final String  SADD="192.168.204.128:2181,192.168.204.128:2182,192.168.204.128:2183";
    //设置会话超时时间
    private static final int time=3000;

    public static void main(String[] args) {
        try {
            ZooKeeper zooKeeper = new ZooKeeper(SADD, time, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    Event.KeeperState state = watchedEvent.getState();
                    Event.EventType type = watchedEvent.getType();
                    if (Event.KeeperState.SyncConnected==state){
                        if (Event.EventType.None==type){
                            System.out.println("zk 启动时链接");
                        }
                    }
                }
            });
                  /*
        ZooDefs.Ids
            ANYONE_ID_UNSAFE :此ID代表任何人。
            AUTH_IDS :该ID仅可用于设置ACL。
            CREATOR_ALL_ACL :只有创建折
            OPEN_ACL_UNSAFE:对所有开放。
            READ_ACL_UNSAFE : 只能读取
        EPHEMERAL
           EPHEMERAL：创建零时节点
           EPHEMERAL_SEQUENTIAL:创建零时节顺序点
           PERSISTENT :创建持久节点
           PERSISTENT_SEQUENTIAL:创建持久节顺序点


         */

            String u = zooKeeper.create("/admin", "users".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
            System.out.println(u);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}

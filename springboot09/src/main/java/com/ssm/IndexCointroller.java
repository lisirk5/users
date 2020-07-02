package com.ssm;

import com.ssm.test01.StuMaper1;
import com.ssm.test02.StuMaper2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexCointroller {
     private static final Logger logger = LoggerFactory.getLogger(IndexCointroller.class);
     @Autowired
     StuMaper2 sqlSessionTemplate2;
     @Autowired
     StuMaper1 sqlSessionTemplate1;
     @RequestMapping("ss")
     @Transactional
    public    String   m(){
         Stu stu=new Stu();
         stu.setId(1002);
         stu.setName("users");
         sqlSessionTemplate1.save(stu);
       /*  int i=2/0;*/
         Stu stu1=new Stu();
         stu1.setId(1002);
         stu1.setName("users");
         sqlSessionTemplate2.save(stu1);
        return   sqlSessionTemplate2.list().toString();
    }



}

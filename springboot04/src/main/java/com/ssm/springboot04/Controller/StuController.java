package com.ssm.springboot04.Controller;

import com.ssm.springboot04.dao.StuDao;
import com.ssm.springboot04.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {
    @Autowired
    private StuDao stuDao;
    @RequestMapping("student")
    public String index(){
        Stu admin = stuDao.findbyname("admin");
        System.out.println(admin);
        return "";
    }
}

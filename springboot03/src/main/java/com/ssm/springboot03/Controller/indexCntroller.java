package com.ssm.springboot03.Controller;

import com.ssm.springboot03.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexCntroller {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("index")
    public String index(){
        studentDao.find("admin","42");
        return "admin";
    }
}

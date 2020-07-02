package com.ssm.Controller;

import com.ssm.dao.Studao;
import com.ssm.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @Autowired
    private Studao studao;
    @RequestMapping("inds")
    public String sys(){
        List<Stu> all = studao.findAll();
        System.out.println(all);
        return "null";
    }
}

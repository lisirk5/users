package com.ssm.springboot06.Controller;

import com.ssm.springboot06.dao.Stumapper;
import com.ssm.springboot06.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @Autowired
    private Stumapper stumapper;

    @RequestMapping("find")
    public String index(){
        List<Stu> all = stumapper.findAll(null);
        System.out.println(all);
        return "";
    }
}

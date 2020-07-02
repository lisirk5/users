package com.ssm.controller;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class indexcontroller {
    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping("/index")
    public  String index(Model model){
        System.out.println("-------------");
        UserMapper mapper=template.getMapper(UserMapper.class);
        List<User> query = mapper.findAll(null);
        System.out.println(query);
        model.addAttribute("user",query);
        return  "login";
    }
}








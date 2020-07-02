package com.ssm.springboot05.Controller;

import com.ssm.springboot05.server.Stuserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @Autowired
    private Stuserver stuserver;
    @RequestMapping("save")
    public String save(){
        return stuserver.stuPageInfo(0,2).toString();
    }
}

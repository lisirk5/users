package com.ssm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
@Controller
public class controllertest {
    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        System.out.println(134);
     return "hello word";
    }
@RequestMapping("/save")
    public String save(Map<String,Object> map){
    System.out.println(123);
        map.put("name","美丽的白衣天使");
        return "save";
    }

}

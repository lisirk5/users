package com.ssm.controller;

import com.ssm.mapper.ProviderMapper;
import com.ssm.pojo.Provider;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProviderController {
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping("jsp/provider.do")
    public String pro(Model model, Provider provider) {
        /*供应商编码*/
        if (provider.getProcode() != null) {
            System.out.println(provider.getProcode());
            provider.setProcode("%" + provider.getProcode() + "%");
        }
        /*供应商编码名称*/
        if (provider.getProname() != null) {
            provider.setProname("%" + provider.getProname() + "%");
        }
        ProviderMapper mapper = template.getMapper(ProviderMapper.class);
        List<Provider> all = mapper.findAll(provider);
        model.addAttribute("providerList", all);
        return "providerlist";
    }

    /*供应商查看页*/
    @RequestMapping("proId.do")
    public String proId(Model model, Provider provider) {
        ProviderMapper mapper = template.getMapper(ProviderMapper.class);
        List<Provider> all = mapper.findAll1(provider);
        System.out.println(provider.getProname());
        System.out.println(all);
        Model providerView = model.addAttribute("providerView", all);
        System.out.println(providerView);
        return "providerview";
    }

    /*供应商修改查看页*/
    @RequestMapping("proView.do")
    public String proview(Model model, long id) {
        ProviderMapper mapper = template.getMapper(ProviderMapper.class);
        Provider id1 = mapper.findId(id);
        model.addAttribute("provider", id1);
        return "providermodify";
    }

    /*供应商修改页*/
    @RequestMapping("provide.do")
    public String provider(Model model, Provider provider) {
        ProviderMapper mapper = template.getMapper(ProviderMapper.class);
        mapper.update(provider);
        System.out.println(provider);
        Provider pro = new Provider();
        List<Provider> all = mapper.findAll(pro);
        model.addAttribute("providerList", all);
        return "providerlist";
    }
}

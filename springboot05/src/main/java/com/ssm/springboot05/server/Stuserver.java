package com.ssm.springboot05.server;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.springboot05.dao.StudaoMapper;
import com.ssm.springboot05.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Stuserver {
    @Autowired
    private StudaoMapper studaoMapper;
    public PageInfo<Stu> stuPageInfo(int page,int size){
        PageHelper.startPage(page,size);
        List<Stu> all = studaoMapper.findAll();
        PageInfo<Stu> stuPageInfo = new PageInfo<>(all);
        return stuPageInfo;
    }
}

package com.ssm.springboot05.dao;

import com.ssm.springboot05.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface StudaoMapper {
    @Select("select * from Stu")
    List<Stu> findAll();
}

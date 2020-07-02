package com.ssm.springboot04.dao;

import com.ssm.springboot04.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface StuDao {
    @Select("select * from Stu where name=#{name}")
    public Stu findbyname(@Param("name") String name);
}

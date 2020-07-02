package com.ssm.springboot06.dao;

import com.ssm.springboot06.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Stumapper {
    public List<Stu> findAll(Stu stu);
}

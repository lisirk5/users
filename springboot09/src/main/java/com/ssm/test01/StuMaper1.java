package com.ssm.test01;

import com.ssm.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StuMaper1 {
    @Select("select *  from  stu")
    public List<Stu>  list();
    @Update(" insert into Stu (id,name)values (#{id},#{name})")
    public void save(Stu stu);
}

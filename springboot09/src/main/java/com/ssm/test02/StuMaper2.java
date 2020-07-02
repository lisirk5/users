package com.ssm.test02;

import com.ssm.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface StuMaper2 {
    @Select("select *  from  Stu")
    public List<Stu>  list();
    @Update(" insert into Stu (id,name)values (#{id},#{name})")
    public void save(Stu stu);

}

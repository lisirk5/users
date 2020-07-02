package com.ssm.mapper;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
@Transactional
public interface UserMapper {
    public List<User> findAll(User user);
    public void save(User user);
    public void update(User user);
    public void del(int id);
}

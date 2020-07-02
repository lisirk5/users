package com.ssm.springboot03.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentDaoimpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void find(String name, String sex) {
        jdbcTemplate.update("insert into Stu values (?,?,?)",1001,name,sex);
    }
}

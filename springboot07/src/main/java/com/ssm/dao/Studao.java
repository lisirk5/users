package com.ssm.dao;

import com.ssm.pojo.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface Studao extends JpaRepository<Stu,Integer>, JpaSpecificationExecutor<Stu> {
}

package com.ssm.mapper;

import com.ssm.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
@Transactional
public interface BillMapper {
    public List<Bill> findAll(Bill bill);
    public Bill findId(int id);
    public void save(Bill bill);
    public void update(Bill bill);
    public String del(int id);
}

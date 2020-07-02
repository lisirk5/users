package com.ssm.mapper;

import com.ssm.pojo.Provider;
import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
@Transactional
public interface ProviderMapper {
    public List<Provider> findAll(Provider provider);
    public List<Provider> findAll1(Provider provider);
    public Provider findId(long id);
    public void save(Provider provider);
    public void update(Provider provider);
    public void del(int id);
}

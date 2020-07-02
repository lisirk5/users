package com.ssm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =Springboot10Application.class)
@EnableCaching
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void test(){
     redisTemplate.opsForSet().add("name","admin");
        Set<String> name = redisTemplate.opsForSet().members("name");
        System.out.println(name);

    }


}


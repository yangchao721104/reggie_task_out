package com.itheima.reggie;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class UploadFileTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }

    @Test
    public void redisTest(){
        redisTemplate.opsForValue().set("city123","beijin");
    }
}

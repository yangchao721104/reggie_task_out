package com.itheima.reggie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author yang
 * @date 2023/6/17 4:49
 */
@SpringBootTest
public class Test01 {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testHash(){
        HashOperations hash = redisTemplate.opsForHash();
        hash.put("002","name","xiaoming");
        hash.put("002","age","123");
        hash.put("002","addr","北京");
   
    }

    @Test
    public void test(){
        redisTemplate.opsForValue().set("楊超","wqeqweq");
    }
}

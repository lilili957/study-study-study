package com.lilili.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    public String getRedis(String redisKey) {
        return stringRedisTemplate.opsForValue().get(redisKey);
    }

    public void setRedis(String redisKey, String value) {
        stringRedisTemplate.opsForValue().set(redisKey, value);
    }
}

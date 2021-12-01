package com.wk.sell.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 */
@Component
@Slf4j
public class RedisLock {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 加锁
     * @param key
     * @param value
     * @return true加锁成功 false加锁失败
     */
    public boolean lock(String key, String value) {
        return true;
    }

    /**
     * 解锁
     * @param key
     * @param value
     * @return
     */
    public void unlock(String key, String value) {

    }

}

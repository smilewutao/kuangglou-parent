package cn.itsource.kuanggou.client.impl;

import cn.itsource.kuanggou.client.RedisClient;

public class RedisClientImpl implements RedisClient {


    @Override
    public String get(String key) {
        return "{\"message\":\"服务器异常!\"}";
    }

    @Override
    public void set(String key, String value) {

    }
}

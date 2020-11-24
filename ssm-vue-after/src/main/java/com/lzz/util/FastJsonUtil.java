package com.lzz.util;

import com.alibaba.fastjson.JSONObject;
import com.lzz.pojo.User;

public class FastJsonUtil {
    //json转换User对象
    public User userJson(String json){
        JSONObject jsonNow = JSONObject.parseObject(json);
        User user = new User();
        user.setName(jsonNow.getString("name"));
        user.setPassword(jsonNow.getString("password"));
        user.setSex(jsonNow.getString("sex"));
        user.setEmail(jsonNow.getString("email"));
        user.setUsername(jsonNow.getString("username"));
        return user;
    }
}

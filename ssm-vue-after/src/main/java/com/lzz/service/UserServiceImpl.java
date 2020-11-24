package com.lzz.service;

import com.lzz.dao.UserMapper;
import com.lzz.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUserByName(String username) {
        return userMapper.deleteUserByName(username);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User queryUserByUserName(String username) {
        return userMapper.queryUserByUserName(username);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    public User queryUserByNamePwd(String username, String password) {
        return userMapper.queryUserByNamePwd(username,password);
    }
}

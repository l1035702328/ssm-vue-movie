package com.lzz.service;

import com.lzz.pojo.User;

import java.util.List;

public interface UserService {
    //增加用户
    int addUser(User user);
    //删除用户 管理员功能
    int deleteUserByName(String username);
    //修改个人信息
    int updateUser(User user);
    //查询一个用户 根据用户名查询
    User queryUserByUserName(String username);
    //查询所有用户信息 管理员功能
    List<User> queryAllUser();
    //查询用户名以及密码是否存在
    User queryUserByNamePwd(String username,String password);
}

package com.lzz.dao;

import com.lzz.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public interface UserMapper {
    //增加用户
    int addUser(User user);
    //删除用户 管理员功能
    int deleteUserByName(@Param("username")String username);
    //修改个人信息
    int updateUser(User user);
    //查询一个用户 根据用户名查询
    User queryUserByUserName(@Param("username")String username);
    //查询所有用户信息 管理员功能
    List<User> queryAllUser();
    //查询用户名及密码如果有则返回一个username
    User queryUserByNamePwd(@Param("username")String username, @Param("password")String password);
}

package com.lzz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lzz.pojo.User;
import com.lzz.service.UserService;
import com.lzz.util.FastJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login_first")
    public String loginVerify(@RequestBody String myForm){
        FastJsonUtil putJson = new FastJsonUtil();
        User user = putJson.userJson(myForm);
        if(userService.queryUserByUserName(user.getUsername())==null){
            userService.addUser(user);
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/admin/login")
    public String loginInfo(@RequestBody String myForm){
        System.out.println(myForm);
        FastJsonUtil putJson = new FastJsonUtil();
        User user = putJson.userJson(myForm);
        User user1=userService.queryUserByNamePwd(user.getUsername(),user.getPassword());
        HashMap<String, String> map = new HashMap<String, String>();
        if(user1!=null){
            map.put("result","success");
            map.put("user",user1.getUsername());
            System.out.println("isok");
            String result = JSON.toJSONString(map);
            return result;
        }else{
            map.put("result","error");
            System.out.println("no");
            String result = JSON.toJSONString(map);
            return result;
        }
    }
}

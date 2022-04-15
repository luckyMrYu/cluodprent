package com.example.hanggeconsumer.controller;

import com.example.hanggeconsumer.bo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "user")
public class UserController {

    //登录的方法
    @RequestMapping(value = "login")
    public String login(String userName, String passWord, HttpServletRequest request) {
        User u = new User();
        u.setUserName("于标奇");
        u.setUserPassWord("123456");
        request.setAttribute("user",u);
        return "已经登录了啊";
    }

    //登录失败的方法
    @RequestMapping(value = "loginerror")
    public String loginerror(){

        return "用户名或者密码错误";
    }

    //不用登录的方法
    @RequestMapping(value = "loginno")
    public String loginno(){

        return "这是一个登录界面：去登陆吧。。。。。";
    }

    //需要登陆的方法
    @RequestMapping(value = "book")
    public String book(){

        return "已经登录了，去看书吧。。。。。";
    }
}

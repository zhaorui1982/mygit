package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getHello() {
        System.out.println(123);
        return "Hello,Word!!!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<User> getUser() {
        return userDao.getUserList();
    }
}

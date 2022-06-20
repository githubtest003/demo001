package com.example.demo.web;


import com.example.demo.bean.Users;
import com.example.demo.biz.UsersBiz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/18.
 */
@Controller
public class UsersController {
    private final static Logger logger = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UsersBiz ubiz;

    @RequestMapping("/")
    public String add() {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String showUsers(Users user) {
        logger.debug("执行注册");
        ubiz.register(user);
        return "login";
    }

    @RequestMapping("/login")
    public String login(Users user) {
        ubiz.login(user);
        return "show";
    }


}

package com.denghb.spring.cloud.controller;

import com.denghb.spring.cloud.domain.User;
import com.denghb.spring.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by denghb on 2017/2/20.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void add(){
        User user = new User();
        user.setAge(1);
        user.setName("张三");
        userService.create(user);
    }
}

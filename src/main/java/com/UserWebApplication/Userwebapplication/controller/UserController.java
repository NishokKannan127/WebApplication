package com.UserWebApplication.Userwebapplication.controller;

import com.UserWebApplication.Userwebapplication.entity.User;
import com.UserWebApplication.Userwebapplication.service.UserService;
import com.UserWebApplication.Userwebapplication.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}

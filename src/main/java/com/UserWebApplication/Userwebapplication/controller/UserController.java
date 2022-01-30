package com.UserWebApplication.Userwebapplication.controller;

import com.UserWebApplication.Userwebapplication.entity.User;
import com.UserWebApplication.Userwebapplication.service.UserService;
import com.UserWebApplication.Userwebapplication.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUserList();
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUser(id);
    }
    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return "user deleted";
    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user){
        return  userService.updateUser(id, user);
    }
    @GetMapping("/users/name/{name}")
    public User getUserByName(@PathVariable("name") String name){
        return userService.getUserByName(name);
    }
}

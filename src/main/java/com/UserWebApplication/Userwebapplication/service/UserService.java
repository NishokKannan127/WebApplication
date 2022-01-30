package com.UserWebApplication.Userwebapplication.service;

import com.UserWebApplication.Userwebapplication.entity.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);
    public List<User> getUserList();
    public User getUser(Long id);
    public void deleteUserById(Long id);

    public User updateUser(Long id, User user);

    public User getUserByName(String name);
}

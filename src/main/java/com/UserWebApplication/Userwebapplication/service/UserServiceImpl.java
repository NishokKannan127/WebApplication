package com.UserWebApplication.Userwebapplication.service;

import com.UserWebApplication.Userwebapplication.entity.User;
import com.UserWebApplication.Userwebapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
}

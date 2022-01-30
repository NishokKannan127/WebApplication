package com.UserWebApplication.Userwebapplication.service;

import com.UserWebApplication.Userwebapplication.entity.User;
import com.UserWebApplication.Userwebapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userGet = userRepository.findById(id).get();
        if(Objects.nonNull(user.getFirstName()) && !"".equalsIgnoreCase(user.getFirstName())){
            userGet.setFirstName(user.getFirstName());
        }
        if(Objects.nonNull(user.getLastName()) && !"".equalsIgnoreCase(user.getLastName())){
            userGet.setLastName(user.getLastName());
        }
        if(Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())){
            userGet.setUserName(user.getUserName());
        }
        if(Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())){
            userGet.setPassword(user.getPassword());
        }
        if(Objects.nonNull(user.getVerified()) && !"".equalsIgnoreCase(user.getVerified())){
            userGet.setVerified(user.getVerified());
        }
        if(Objects.nonNull(user.getVerifiedOn())){
            userGet.setVerifiedOn(user.getVerifiedOn());
        }
        return userRepository.save(userGet);
    }

    @Override
    public User getUserByName(String name) {
        //return userRepository.getUserByName(name);
        return userRepository.getUserByNameIgnoreCase(name);
    }


}

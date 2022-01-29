package com.UserWebApplication.Userwebapplication.repository;

import com.UserWebApplication.Userwebapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

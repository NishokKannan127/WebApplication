package com.UserWebApplication.Userwebapplication.repository;

import com.UserWebApplication.Userwebapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User getUserByName(String firstName);
    @Query(value="", nativeQuery=true)
    public User getUserByNameIgnoreCase(String firstName);
}

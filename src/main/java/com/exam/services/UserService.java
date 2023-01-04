package com.exam.services;

import com.exam.models.User;
import com.exam.models.UserRole;

import java.util.Set;


public interface UserService {

    //creating user
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    User getUser(String username);

    //delete user by id
    void delete(Long id);
}

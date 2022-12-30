package com.exam.services.impl;

import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.repositories.RoleRepository;
import com.exam.repositories.UserRepository;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        //creating user & checking whether user is exist or not
        User local = userRepository.findByUsername(user.getUsername());
        if(local != null){
            System.out.println("user is already exist");
            throw new Exception("User is already present");
        }
        else {
            for(UserRole ur : userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = userRepository.save(user);
        }
        return local;
    }

    //deleting user
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    //get user by username
    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
}

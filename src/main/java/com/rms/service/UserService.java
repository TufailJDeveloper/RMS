package com.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entity.User;
import com.rms.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        User savedUser = userRepository.save(user);
		return savedUser;
        
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

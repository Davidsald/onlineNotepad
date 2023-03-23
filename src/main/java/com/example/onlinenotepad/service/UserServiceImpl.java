package com.example.onlinenotepad.service;

import com.example.onlinenotepad.model.User;
import com.example.onlinenotepad.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUserList() {
       return userRepository.findAll();

    }

    @Override
    public void deleteUser(Long id) {

    }

}

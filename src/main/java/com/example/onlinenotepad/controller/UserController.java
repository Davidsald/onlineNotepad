package com.example.onlinenotepad.controller;

import com.example.onlinenotepad.model.User;
import com.example.onlinenotepad.service.UserService;
import com.example.onlinenotepad.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
   UserService userService;

    @GetMapping
    public List<User> home(){
        return userService.getUserList();
    }

}

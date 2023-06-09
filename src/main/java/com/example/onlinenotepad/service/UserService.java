package com.example.onlinenotepad.service;

import com.example.onlinenotepad.model.Note;
import com.example.onlinenotepad.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User>  getUserList();

    User getUser(Long id);
    void deleteUser(Long id);

}

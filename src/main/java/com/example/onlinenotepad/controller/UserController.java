package com.example.onlinenotepad.controller;

import com.example.onlinenotepad.model.Note;
import com.example.onlinenotepad.model.User;
import com.example.onlinenotepad.service.NoteService;
import com.example.onlinenotepad.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
   UserService userService;

    @Autowired
    NoteService noteService;

    @GetMapping
    public List<User> home(){
        return userService.getUserList();
    }

    @GetMapping("/{userid}")
    public List<Note> getNotesById(@PathVariable("userid") Long userid){
        return noteService.getNotesByUserId(userid);
    }

}

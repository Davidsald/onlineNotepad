package com.example.onlinenotepad;

import com.example.onlinenotepad.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ApplicationController {


    @Autowired
    NoteRepository noteRepo;
    @GetMapping("/")
    public String getHomePage(){
        return "home";
    }
    @GetMapping("/login")
    public String getLoginPage(){
        return "registrationform";
    }
    @GetMapping("/dashboard")
    public String getDashboard(){
        return "dashboard";
    }

    @GetMapping("/dashboard/{userId}")
    public String getNotesById(@PathVariable("userId") Long userId, Model model){
        model.addAttribute("notes", noteRepo.findByUserId(userId));

        return "dashboard";
    }

}

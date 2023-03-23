package com.example.onlinenotepad;

import com.example.onlinenotepad.model.Note;
import com.example.onlinenotepad.model.User;
import com.example.onlinenotepad.service.NoteService;
import com.example.onlinenotepad.service.UserService;
import com.example.onlinenotepad.service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class OnlineNotepadApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineNotepadApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserService userService, NoteService noteService) {
        return (args) -> {

            List<User> userList = userService.getUserList();
            for (User person : userList) {
                System.out.println(person);
            }
            List<Note> noteList = noteService.getNotesByUserId(1L);
            for (Note note : noteList) {
                System.out.println(note);
            }

        };
    }
}

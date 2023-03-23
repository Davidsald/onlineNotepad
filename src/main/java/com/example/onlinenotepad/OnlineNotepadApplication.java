package com.example.onlinenotepad;

import com.example.onlinenotepad.model.User;
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
    public CommandLineRunner demo(UserService userService) {
        return (args) -> {

            User user = new User();
            user.setfName("dato");
            user.setlName("saldadze");
            user.setId(1L);
            user.setEmail("d@gmail.com");
            userService.addUser(user);

            List<User> userList = userService.getUserList();
            for (User person : userList) {
                System.out.println(person);
            }
        };
    }
}

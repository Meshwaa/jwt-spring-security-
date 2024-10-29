package com.example.security.controller;

import com.example.security.model.Users;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public Users register(@RequestBody Users user){
        return userService.registerUser(user);
    }

    @PostMapping("/users/login")
    public String login(@RequestBody Users user){
        return userService.verify(user);
    }
}
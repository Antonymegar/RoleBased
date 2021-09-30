package com.example.rolebased.controllers;

import com.example.rolebased.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    private UserRepository  repo;
    @GetMapping("/")
    public String viewHomePage(){
        return  "index";
    }
    @GetMapping("/new")
    public String newUser(){
        return  "create_user";
    }
    @GetMapping("/admin")
    public String adminPanel(){
        return  "admin";
    }
    @GetMapping("/edit")
    public String editUser(){
        return  "edit_user";
    }
    @GetMapping("/create_meeting")
    public String editMeeting(){
        return  "meeting";
    }



}

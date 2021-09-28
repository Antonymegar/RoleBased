package controllers;

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
    @GetMapping("/admin")
    public String adminPanel(){
        return  "admin";
    }
    @GetMapping("/new")
    public String addMeeting(){
        return  "meeting";
    }
    @GetMapping("/edit")
    public String editMeeting(){
        return  "edit_meeting";
    }

}

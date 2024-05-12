package com.example.demo.controllers;

import com.example.demo.Models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get-first-name")
    public String getFirstName(){
        return "Milan";
    }
    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList(){
        return List.of("Milan","Dota");
    }
    @PostMapping("get-something")
    public boolean createUser(String firstName, String lastName){
        return true;
    }
    @PostMapping("create-user-body")
    public boolean createUserBody(@RequestBody UserModel userModel){
        return true;
    }
}

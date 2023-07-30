package com.example.flexproject07.controller;

import com.example.flexproject07.entity.User;
import com.example.flexproject07.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/users/login")
    public String login(String username, String password){
        if(userService.doLogin(username,password)!=null)return "Login successfully!";
        return "Your account can not found!";
    }
    @GetMapping("/user/getAll")
    public List<User> findAllUsers(){
            List<User> list = userService.getAllUsers();
            return list;
    }
    @PostMapping("/users/signin")
    public String doSignIn(@RequestBody User user){
        if(userService.signIn(user)==true) return "Sign In successfully!";
        return "SignIn fail!";
    }
}

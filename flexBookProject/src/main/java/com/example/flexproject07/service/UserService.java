package com.example.flexproject07.service;

import com.example.flexproject07.entity.User;
import com.example.flexproject07.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User doLogin(String username, String password){
        List<User> list = userRepository.findAll();
        for(User u : list){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }
    public List<User> getAllUsers(){
        List<User> list = userRepository.findAll();
        return list;
    }
    public boolean signIn(User user){
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return false;
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return false;
        }
        user.setPassword(user.getPassword());
        userRepository.save(user);
        return true;
    }
}

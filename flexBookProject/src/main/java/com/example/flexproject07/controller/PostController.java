package com.example.flexproject07.controller;

import com.example.flexproject07.config.exception.ResourceNotFoundException;
import com.example.flexproject07.entity.Post;
import com.example.flexproject07.entity.User;
import com.example.flexproject07.repository.PostRepository;
import com.example.flexproject07.repository.UserRepository;
import com.example.flexproject07.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("")
    public List<Post> findAllPosts(){
        List<Post> list = postService.getAllPosts();
         return list;
    }
    @GetMapping("/getById")
    public List<Post> findPostById(@RequestParam int userId){
        return postService.getAllPostsById(userId);
    }
    @GetMapping("/getByUserName")
    public List<Post> findPostByUserName(@RequestParam String username){
        return postService.getAllPostsByUserName(username);
    }

}

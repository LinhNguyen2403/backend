package com.example.flexproject07.service;

import com.example.flexproject07.entity.Post;
import com.example.flexproject07.entity.User;
import com.example.flexproject07.repository.PostRepository;
import com.example.flexproject07.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public List<Post> getAllPostsById(int userId){
        return postRepository.findByUserId(userId);
    }
    public List<Post> getAllPostsByUserName(String username){
        return postRepository.findByUserName(username);
    }
}

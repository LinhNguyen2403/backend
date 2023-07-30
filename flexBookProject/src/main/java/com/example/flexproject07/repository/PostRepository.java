package com.example.flexproject07.repository;

import com.example.flexproject07.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository <Post, Integer> {
@Query("SELECT p FROM Post p JOIN p.user u WHERE u.userId = :userId ")
    List<Post> findByUserId(int userId);
    @Query("SELECT p FROM Post p JOIN p.user u WHERE u.username = :username ")
    List<Post> findByUserName(String username);

}

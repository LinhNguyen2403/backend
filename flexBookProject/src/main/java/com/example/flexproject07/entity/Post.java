package com.example.flexproject07.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="posts")
@AllArgsConstructor
@NoArgsConstructor
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private int postid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column (name="content" ,nullable = true, columnDefinition = "text")
    private String content;

    @Column (name="post_image", nullable = true, length = 255)
    private String postImage;

    @Column (name="creates_at", columnDefinition = "timestamp")
    private Timestamp createdAt;

    @Column (name="update_date",columnDefinition = "timestamp")
    private Timestamp updateDate;
}


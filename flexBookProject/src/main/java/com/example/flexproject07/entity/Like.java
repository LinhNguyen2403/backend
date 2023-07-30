package com.example.flexproject07.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.security.Timestamp;

@Data
@Entity
@Table(name="likes")
@AllArgsConstructor
@NoArgsConstructor
public class Like implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="like_id")
    private Integer likeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="post_id")
    private Post post;

    @Column (name="created_at",columnDefinition = "timestamp")
    private Timestamp createAt;

}

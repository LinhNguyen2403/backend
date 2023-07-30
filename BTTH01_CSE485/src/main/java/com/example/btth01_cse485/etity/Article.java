package com.example.btth01_cse485.etity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name="article")
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {
    @Id
    @Column(name="article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artId;

    @Column(name = "title")
    private String title;

    @Column(name="song")
    private String song;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genres_id")
    private Genres genres;

    @Column(name="summary", length = 5000)
    private String summary;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name="created_at")
    private Timestamp createdAt;
}

package com.example.btth01_cse485.etity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Table(name="author")
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {
    @Id
    @Column(name="author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column(name="name")
    private String name;
}

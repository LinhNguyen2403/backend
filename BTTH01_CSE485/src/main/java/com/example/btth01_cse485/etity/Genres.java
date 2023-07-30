package com.example.btth01_cse485.etity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Table(name="genres")
@AllArgsConstructor
@NoArgsConstructor
public class Genres implements Serializable{
    @Id
    @Column(name="genres_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genresId;

    @Column(name="name")
    private String name;
}

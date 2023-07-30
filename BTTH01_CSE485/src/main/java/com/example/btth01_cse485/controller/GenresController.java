package com.example.btth01_cse485.controller;

import com.example.btth01_cse485.etity.Article;
import com.example.btth01_cse485.etity.Genres;
import com.example.btth01_cse485.service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/genres")
public class GenresController {
    @Autowired
    GenresService genresService;
    @GetMapping
    public List<Genres>findGenresWithoutArticle(){
        return genresService.getGenresWithoutArticle();
    }
    @GetMapping("/findGenresWithMaximumArticle")
    public Optional<Genres> findGenresWithMaximumArticle(@RequestParam int limit){
        return genresService.getGenresWithMaximumArticle(limit);
    }
}

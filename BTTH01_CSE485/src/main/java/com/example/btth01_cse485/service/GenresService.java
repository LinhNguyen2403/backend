package com.example.btth01_cse485.service;

import com.example.btth01_cse485.etity.Genres;
import com.example.btth01_cse485.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenresService {
    @Autowired
    GenresRepository genresRepository;

    public List<Genres> getGenresWithoutArticle() {
        return genresRepository.findAllGenresWithoutArticle();
    }
    public Optional<Genres> getGenresWithMaximumArticle(int limit){
        return genresRepository.findGenersWithMaximumArticles(limit);
    }
}

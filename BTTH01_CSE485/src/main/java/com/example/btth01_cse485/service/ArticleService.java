package com.example.btth01_cse485.service;

import com.example.btth01_cse485.etity.Article;
import com.example.btth01_cse485.repository.ArticleRepository;
import com.example.btth01_cse485.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    public List<Article> getArticlesByGenresName(String genresName) {
       return articleRepository.findByGenresName(genresName);
    }
    public List<Article> getArticlesByAuthorName(String authorName) {
        return articleRepository.findByAuthorName(authorName);
    }
    public List<Article> getAllArticleInfor() {
        return articleRepository.findAllInformation();
    }
    public List<Article> getArticlesByKeySong(String keySong) {
        return articleRepository.findByKeySong(keySong);
    }
    public List<Article> getArticlesByKeySearch(String keySearch) {
        return articleRepository.findByKeySong(keySearch);
    }
}

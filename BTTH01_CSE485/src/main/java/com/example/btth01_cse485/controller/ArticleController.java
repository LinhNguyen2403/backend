package com.example.btth01_cse485.controller;

import com.example.btth01_cse485.etity.Article;
import com.example.btth01_cse485.repository.ArticleRepository;
import com.example.btth01_cse485.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    ArticleRepository articleRepository;
    @GetMapping("/findByGenresName")
    public List<Article> findArticlesByGenresName(@RequestParam String genresName){
        return articleService.getArticlesByGenresName(genresName);
    }
    @GetMapping("/findByAuthor")
    public List<Article> findArticlesByAuthorName(@RequestParam String authorName){
        return articleService.getArticlesByAuthorName(authorName);
    }
    @GetMapping("/findAllInformation")
    public List<Article> findArticlesInformation(){
        return articleService.getAllArticleInfor();
    }
    @GetMapping("/findArticlesByKeySong")
    public List<Article> findArticlesByKeySong(String keySong){
        return articleService.getArticlesByKeySong(keySong);
    }
    @GetMapping("/findArticlesByKeySearch")
    public List<Article> findArticlesByKeySearch(String keySearch){
        return articleService.getArticlesByKeySearch(keySearch);
    }


}

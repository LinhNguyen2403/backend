package com.example.btth01_cse485.repository;

import com.example.btth01_cse485.etity.Article;
import com.example.btth01_cse485.etity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Integer>{
    @Query("SELECT a FROM Article a JOIN a.genres g WHERE g.name = :genresName")
    List<Article> findByGenresName(String genresName);
    @Query("SELECT a FROM Article a JOIN a.author a1 WHERE a1.name = :authorName")
    List<Article> findByAuthorName(String authorName);
    @Query("SELECT a.artId,a.title, a.song, a.author.name, a.genres.name, a.createdAt FROM Article a")
    List<Article> findAllInformation();
    @Query("SELECT a FROM Article a JOIN a.genres a1 WHERE a1.name LIKE %:keySong%")
    List<Article> findByKeySong(String keySong);
    @Query("SELECT a FROM Article a JOIN a.genres a1 WHERE a1.name LIKE %:keySearch% OR a.title LIKE %:keySearch%")
    List<Article> findByKeySearch(String keySearch);

}

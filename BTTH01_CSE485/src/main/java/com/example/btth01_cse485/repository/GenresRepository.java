package com.example.btth01_cse485.repository;

import com.example.btth01_cse485.etity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenresRepository extends JpaRepository <Genres, Integer>{
    @Query("SELECT g FROM Genres g LEFT JOIN Article a ON g.genresId = a.genres.genresId WHERE a.genres.genresId is null")
    List<Genres> findAllGenresWithoutArticle();
    @Query(value="SELECT g.genres_id FROM Genres g JOIN Article a ON g.genres_id = a.genres_id Group by a.artcle_id order by sum(a.article_id) desc limit ?1", nativeQuery=true)
    Optional<Genres> findGenersWithMaximumArticles(int limit);
}

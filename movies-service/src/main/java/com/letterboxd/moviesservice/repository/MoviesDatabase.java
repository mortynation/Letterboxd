package com.letterboxd.moviesservice.repository;

import com.letterboxd.moviesservice.entity.Movie;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesDatabase extends JpaRepository<Movie, String> {
    Movie[] findByMovieName(String movieName);
}

package com.letterboxd.moviesservice.controller;


import com.letterboxd.moviesservice.dto.ResponseDTO;
import com.letterboxd.moviesservice.entity.Movie;
import com.letterboxd.moviesservice.service.MoviesService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/movies")
public class MoviesController {

    public static final String MOVIES_SERVICE = "moviesService";

    @Autowired
    private MoviesService moviesService;

    @PostMapping("/")
    public Movie saveMovie(@RequestBody Movie movie){
        log.info("Inside saveMovie of MoviesController");
        return moviesService.saveMovie(movie);
    }

    @GetMapping("/{movieName}")
    @CircuitBreaker(name = MOVIES_SERVICE, fallbackMethod = "moviesServiceFallBackMethod")
    public ResponseDTO getMovieReviews(@PathVariable String movieName){
        log.info("Inside getMovie of MoviesController");
        return moviesService.getMovieReviews(movieName);
    }

    public ResponseDTO moviesServiceFallBackMethod(Exception e){
        System.out.println("Movies Service is currently offline, please try again some time later.");
        return null;
    }
}

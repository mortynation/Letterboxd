package com.letterboxd.moviesservice.controller;


import com.letterboxd.moviesservice.dto.ResponseDTO;
import com.letterboxd.moviesservice.entity.Movie;
import com.letterboxd.moviesservice.service.MoviesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @PostMapping("/")
    public Movie saveMovie(@RequestBody Movie movie){
        log.info("Inside saveMovie of MoviesController");
        return moviesService.saveMovie(movie);
    }

    @GetMapping("/{movieName}")
    public ResponseDTO getMovie(@PathVariable String movieName){
        log.info("Inside getMovie of MoviesController");
        return moviesService.getMovie(movieName);
    }
}

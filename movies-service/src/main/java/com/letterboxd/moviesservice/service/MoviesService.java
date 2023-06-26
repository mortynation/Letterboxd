package com.letterboxd.moviesservice.service;

import com.letterboxd.moviesservice.dto.ResponseDTO;
import com.letterboxd.moviesservice.dto.ReviewerDTO;
import com.letterboxd.moviesservice.entity.Movie;
import com.letterboxd.moviesservice.repository.MoviesDatabase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class MoviesService {

    @Autowired
    private MoviesDatabase moviesDatabase;

    @Autowired
    private RestTemplate restTemplate;

    public Movie saveMovie(Movie movie) {
        log.info("Inside saveMovie of MoviesService");
        return moviesDatabase.save(movie);
    }

    public ResponseDTO getMovieReviews(String movieName) {
        log.info("Inside getMovie of MoviesService");
        ResponseDTO responseDTO = new ResponseDTO();

        Movie[] movieDTO = moviesDatabase.findByMovieName(movieName);
        ReviewerDTO[] reviewerDTO = restTemplate.getForObject("http://REVIEWERS-SERVICE/reviewers/movie/" +
                movieName, ReviewerDTO[].class);

        responseDTO.setMovieDTO(movieDTO);
        responseDTO.setReviewerDTO(reviewerDTO);
        return responseDTO;

    }
}

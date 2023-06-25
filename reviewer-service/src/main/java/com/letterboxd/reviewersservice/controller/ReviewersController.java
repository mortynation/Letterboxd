package com.letterboxd.reviewersservice.controller;

import com.letterboxd.reviewersservice.entity.Reviewer;
import com.letterboxd.reviewersservice.service.ReviewersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/reviewers")
public class ReviewersController {

    @Autowired
    private ReviewersService reviewersService;

    @PostMapping("/")
    public Reviewer saveReviewer(@RequestBody Reviewer reviewer){
        log.info("Inside saveReviewer of ReviewersController");
        return reviewersService.saveReviewer(reviewer);
    }

    @GetMapping("/{userName}")
    public Reviewer getReviewer(@PathVariable String userName){
        log.info("Inside getReviewer of ReviewersController");
        return reviewersService.getReviewer(userName);
    }
}

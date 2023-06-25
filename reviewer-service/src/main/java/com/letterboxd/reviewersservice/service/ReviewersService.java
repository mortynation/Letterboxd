package com.letterboxd.reviewersservice.service;

import com.letterboxd.reviewersservice.entity.Reviewer;
import com.letterboxd.reviewersservice.repository.ReviewersDatabase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReviewersService {

    @Autowired
    private ReviewersDatabase reviewersDatabase;

    public Reviewer saveReviewer(Reviewer reviewer) {
        log.info("Inside saveReviewer of ReviewersService");
        return reviewersDatabase.save(reviewer);
    }

    public Reviewer getReviewer(String userName) {
        log.info("Inside getReviewer of ReviewersService");
        return reviewersDatabase.findByUserName(userName);
    }
}

package com.letterboxd.reviewersservice.repository;

import com.letterboxd.reviewersservice.entity.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewersDatabase extends JpaRepository<Reviewer, String> {
    Reviewer findByUserName(String userName);
}

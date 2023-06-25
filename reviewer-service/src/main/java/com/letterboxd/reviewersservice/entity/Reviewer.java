package com.letterboxd.reviewersservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviewer {

    @Id
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String movieName;
    private String reviewId;
}

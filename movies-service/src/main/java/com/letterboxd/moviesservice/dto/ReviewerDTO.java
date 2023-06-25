package com.letterboxd.moviesservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewerDTO {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String movieName;
    private String review;
    private int rating;
}

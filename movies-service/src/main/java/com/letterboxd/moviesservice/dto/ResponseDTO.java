package com.letterboxd.moviesservice.dto;

import com.letterboxd.moviesservice.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private ReviewerDTO reviewerDTO;
    private Movie movieDTO;


}

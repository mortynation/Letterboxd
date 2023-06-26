package com.letterboxd.moviesservice.dto;

import com.letterboxd.moviesservice.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDTO {

    private Movie[] movieDTO;
    private ReviewerDTO[] reviewerDTO;

}

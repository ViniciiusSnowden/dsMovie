package com.paulovinicius.dsmovie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class ScoreDTO {
    private Long movieId;
    private String email;
    private Double score;

    
}

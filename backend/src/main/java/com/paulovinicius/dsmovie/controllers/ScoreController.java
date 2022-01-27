package com.paulovinicius.dsmovie.controllers;

import com.paulovinicius.dsmovie.dto.MovieDTO;
import com.paulovinicius.dsmovie.dto.ScoreDTO;

import com.paulovinicius.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService serivce;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
       MovieDTO movieDTO = serivce.saveScore(dto);
       return movieDTO;
    }


}

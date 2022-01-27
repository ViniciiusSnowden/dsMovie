package com.paulovinicius.dsmovie.services;


import com.paulovinicius.dsmovie.dto.MovieDTO;
import com.paulovinicius.dsmovie.dto.ScoreDTO;
import com.paulovinicius.dsmovie.entitites.Movie;
import com.paulovinicius.dsmovie.entitites.Score;
import com.paulovinicius.dsmovie.entitites.User;
import com.paulovinicius.dsmovie.repositories.MovieRepository;
import com.paulovinicius.dsmovie.repositories.ScoreRepository;
import com.paulovinicius.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){
        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.save(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for(Score s :movie.getScores()){
            sum = sum + s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }






}

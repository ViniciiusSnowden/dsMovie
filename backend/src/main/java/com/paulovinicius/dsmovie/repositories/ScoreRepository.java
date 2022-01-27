package com.paulovinicius.dsmovie.repositories;

import com.paulovinicius.dsmovie.entitites.Movie;
import com.paulovinicius.dsmovie.entitites.Score;
import com.paulovinicius.dsmovie.entitites.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}

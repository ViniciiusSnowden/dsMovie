package com.paulovinicius.dsmovie.repositories;

import com.paulovinicius.dsmovie.entitites.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long > {


}

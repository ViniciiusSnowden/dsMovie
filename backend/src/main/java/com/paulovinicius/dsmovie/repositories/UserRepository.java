package com.paulovinicius.dsmovie.repositories;

import com.paulovinicius.dsmovie.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

    User findByEmail(String email);

}

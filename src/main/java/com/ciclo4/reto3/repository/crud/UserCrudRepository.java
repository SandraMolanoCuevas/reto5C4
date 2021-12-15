package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    // Reto 5
    List<User> findByMonthBirthtDay(String monthBirthtDay);

    Optional<User> findTopByOrderByIdDesc();

}

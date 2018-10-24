package com.repositories;

import com.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, String> {

    @Override
    Optional<Movie> findById(String id);

    @Override
    void delete(Movie deleted);

}

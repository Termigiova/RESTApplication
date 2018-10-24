package com.repositories;

import com.models.MovieDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieDetailRepository extends MongoRepository<MovieDetail, String> {

    @Override
    Optional<MovieDetail> findById(String id);

    @Override
    void delete(MovieDetail deleted);

}

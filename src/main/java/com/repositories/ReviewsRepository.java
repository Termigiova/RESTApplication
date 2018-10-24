package com.repositories;

import com.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewsRepository extends MongoRepository<Review, String> {

    @Override
    Optional<Review> findById(String id);

    @Override
    void delete(Review deleted);

}

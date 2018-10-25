package com.controllers;

import com.models.Review;
import com.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReviewController {

    @Autowired
    ReviewsRepository reviewsRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/reviews")
    public Iterable<Review> reviews() { return reviewsRepository.findAll(); }

    @RequestMapping(method = RequestMethod.GET, value = "/reviews/movies/{id}")
    public Review getMovie(@PathVariable String id) {
        return reviewsRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/reviews")
    public String save(@RequestBody Review review) {
        reviewsRepository.save(review);

        return review.getId();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reviews/{id}")
    public Review show(@PathVariable String id) { return reviewsRepository.findById(id).get(); }

    @RequestMapping(method = RequestMethod.PUT, value = "/reviews/{id}")
    public Review update(@PathVariable String id, @RequestBody Review requestedReview) {
        Review review = reviewsRepository.findById(id).get();
        review.assignValuesFrom(requestedReview);

        reviewsRepository.save(review);
        return review;
    }

}

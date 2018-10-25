package com.controllers;

import com.models.MovieDetail;
import com.repositories.MovieDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieDetailController {

    @Autowired
    MovieDetailRepository movieDetailRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/movieDetails")
    public Iterable<MovieDetail> movieDetail() { return movieDetailRepository.findAll(); }

    @RequestMapping(method = RequestMethod.GET, value = "/movieDetails/{id}")
    public MovieDetail getMovie(@PathVariable String id) {
        return movieDetailRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movieDetails")
    public String save(@RequestBody MovieDetail movieDetail) {
        movieDetailRepository.save(movieDetail);

        return movieDetail.getId();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/movieDetails/{id}")
    public MovieDetail show(@PathVariable String id) { return movieDetailRepository.findById(id).get(); }

    @RequestMapping(method = RequestMethod.PUT, value = "/movieDetails/{id}")
    public MovieDetail update(@PathVariable String id, @RequestBody MovieDetail requestedMovieDetail) {
        MovieDetail movieDetail = movieDetailRepository.findById(id).get();
        movieDetail.assignValuesFrom(requestedMovieDetail);

        movieDetailRepository.save(movieDetail);
        return movieDetail;
    }

}

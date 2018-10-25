package com.controllers;

import com.models.Movie;
import com.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(method = RequestMethod.GET, value="/movies")
    public Iterable<Movie> movie() { return movieRepository.findAll(); }

    @RequestMapping(method = RequestMethod.POST, value="/movies")
    public String save(@RequestBody Movie movie) {
        movieRepository.save(movie);

        return movie.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/movies/{id}")
    public Movie show(@PathVariable String id) {
        return movieRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/movies/{id}")
    public Movie update(@PathVariable String id, @RequestBody Movie requestedMovie) {
        Movie movie = movieRepository.findById(id).get();
        movie.assignValuesFrom(requestedMovie);

        movieRepository.save(movie);
        return movie;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "movies/{id}")
    public String delete(@PathVariable String id) {
        Movie movie = movieRepository.findById(id).get();
        movieRepository.delete(movie);

        return "Movie deleted";
    }

}

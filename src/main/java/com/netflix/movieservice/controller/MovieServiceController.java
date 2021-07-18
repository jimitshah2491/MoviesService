package com.netflix.movieservice.controller;

import com.netflix.movieservice.model.Movie;
import com.netflix.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieServiceController {

    private MovieService movieServiceImpl;

    @Autowired
    public MovieServiceController(MovieService movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }

    @GetMapping("/users/{userId}/movies")
    public List<Movie> getMovies(@PathVariable("userId") int userId) {
        return movieServiceImpl.getMovies(userId);
    }
}

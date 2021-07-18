package com.netflix.movieservice.service;

import com.netflix.movieservice.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMovies(int userId);
}

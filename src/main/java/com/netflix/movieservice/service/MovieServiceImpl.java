package com.netflix.movieservice.service;

import com.netflix.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public List<Movie> getMovies(int userId) {
        return null;
    }
}

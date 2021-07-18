package com.netflix.movieservice.model;

import lombok.Data;

@Data
public class Movie {
    // add validation annotations
    private String title;
    private String image;
    private int movieId;
}
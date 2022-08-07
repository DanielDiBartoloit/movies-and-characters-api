package com.alkemy.movies.api.service;

import com.alkemy.movies.api.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    MovieDTO save(MovieDTO dto);
    List<MovieDTO> getAllMovies();


}

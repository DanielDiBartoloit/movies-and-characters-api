package com.alkemy.movies.api.service;

import com.alkemy.movies.api.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    MovieDTO saveMovie(MovieDTO dto);
    List<MovieDTO> getAllMovies();


    void deleteMovie(Long id);
}

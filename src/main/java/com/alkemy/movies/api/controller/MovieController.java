package com.alkemy.movies.api.controller;

import com.alkemy.movies.api.dto.MovieDTO;
import com.alkemy.movies.api.service.MovieService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("movies")
@Getter
@Setter
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movie) {

        MovieDTO savedMovie = movieService.save(movie);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedMovie);
    }


}

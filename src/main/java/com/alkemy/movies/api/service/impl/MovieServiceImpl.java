package com.alkemy.movies.api.service.impl;

import com.alkemy.movies.api.dto.MovieDTO;
import com.alkemy.movies.api.entity.MovieEntity;
import com.alkemy.movies.api.mapper.MovieMapper;
import com.alkemy.movies.api.repository.MovieRepository;
import com.alkemy.movies.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private MovieRepository movieRepository;

    public MovieDTO saveMovie(MovieDTO dto) {
        MovieEntity entity = movieMapper.movieDTO2Entity(dto);
        MovieEntity savedEntity = movieRepository.save(entity);
        MovieDTO result = movieMapper.movieEntity2DTO(savedEntity, Boolean.TRUE);
        return result;
    }

    public List<MovieDTO> getAllMovies() {
        List<MovieEntity> entities = movieRepository.findAll();
        List<MovieDTO> result = movieMapper.moviesEntityList2DTOList(entities, Boolean.TRUE);
        return result;
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

}




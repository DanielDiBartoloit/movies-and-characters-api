package com.alkemy.movies.api.mapper;

import com.alkemy.movies.api.dto.MovieDTO;
import com.alkemy.movies.api.entity.MovieEntity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MovieMapper {

    public MovieEntity movieDTO2Entity(MovieDTO dto) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setImage(dto.getImage());
        movieEntity.setTitle(dto.getTitle());
        movieEntity.setCreationDate(dto.getCreationDate());
        movieEntity.setRating(dto.getRating());
        movieEntity.setCharacters(dto.getCharacters());
        return movieEntity;
    }

    public MovieDTO movieEntity2DTO(MovieEntity entity) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(entity.getId());
        movieDTO.setImage(entity.getImage());
        movieDTO.setTitle(entity.getTitle());
        movieDTO.setCreationDate(entity.getCreationDate());
        movieDTO.setRating(entity.getRating());
        movieDTO.setCharacters(entity.getCharacters());
        return movieDTO;
    }


    public List<MovieDTO> moviesEntityList2DTOList(List<MovieEntity> entities) {
        List<MovieDTO> dtos = new ArrayList<>();

        for (MovieEntity entity : entities
        ) {
            dtos.add(this.movieEntity2DTO(entity));
        }

        return dtos;
    }


}

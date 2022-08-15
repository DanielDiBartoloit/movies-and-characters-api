package com.alkemy.movies.api.mapper;

import com.alkemy.movies.api.dto.CharacterDTO;
import com.alkemy.movies.api.dto.MovieDTO;
import com.alkemy.movies.api.entity.CharacterEntity;
import com.alkemy.movies.api.entity.MovieEntity;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Component
public class MovieMapper {

    @Autowired
    private CharacterMapper characterMapper;

    public MovieEntity movieDTO2Entity(MovieDTO dto) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setImage(dto.getImage());
        movieEntity.setTitle(dto.getTitle());
        movieEntity.setCreationDate(this.string2LocalDate(dto.getCreationDate()));
        movieEntity.setRating(dto.getRating());

        List<CharacterEntity> entitiesCharacters = characterMapper.characterDTOList2EntityList(dto.getCharacters());

        movieEntity.setCharacters(entitiesCharacters);
        return movieEntity;
    }

    public MovieDTO movieEntity2DTO(MovieEntity entity, boolean loadCharacters) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(entity.getId());
        movieDTO.setImage(entity.getImage());
        movieDTO.setTitle(entity.getTitle());
        movieDTO.setCreationDate(entity.getCreationDate().toString());
        movieDTO.setRating(entity.getRating());

        if (loadCharacters) {
            List<CharacterDTO> DTOCharacters = characterMapper.characterEntityList2DTOList(entity.getCharacters(), false);
            movieDTO.setCharacters(DTOCharacters);
        }

        return movieDTO;
    }

    public List<MovieDTO> moviesEntityList2DTOList(List<MovieEntity> entities, boolean loadCharacters) {
        List<MovieDTO> dtos = new ArrayList<>();

        for (MovieEntity entity : entities) {
            dtos.add(this.movieEntity2DTO(entity, loadCharacters));
        }

        return dtos;
    }

    private LocalDate string2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

}



package com.alkemy.movies.api.mapper;

import com.alkemy.movies.api.dto.CharacterDTO;

import com.alkemy.movies.api.dto.MovieDTO;
import com.alkemy.movies.api.entity.CharacterEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterMapper {

    @Autowired
    private MovieMapper movieMapper;

    public CharacterEntity characterDTO2Entity(CharacterDTO dto) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setImage(dto.getImage());
        characterEntity.setName(dto.getName());
        characterEntity.setAge(dto.getAge());
        characterEntity.setWeight(dto.getWeight());
        characterEntity.setStory(dto.getStory());
        return characterEntity;
    }

    public CharacterDTO characterEntity2DTO(CharacterEntity entity, boolean loadMovies) {
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(entity.getId());
        characterDTO.setImage(entity.getImage());
        characterDTO.setName(entity.getName());
        characterDTO.setAge(entity.getAge());
        characterDTO.setWeight(entity.getWeight());
        characterDTO.setStory(entity.getStory());

        if (loadMovies) {
            List<MovieDTO> DTOMovies = movieMapper.moviesEntityList2DTOList(entity.getMovies(), false);
            characterDTO.setMovies(DTOMovies);
        }

        return characterDTO;
    }


    public List<CharacterDTO> characterEntityList2DTOList(List<CharacterEntity> characterEntityList, boolean loadMovies) {
        List<CharacterDTO> dtos = new ArrayList<>();

        for (CharacterEntity characterEntity : characterEntityList) {
            dtos.add(this.characterEntity2DTO(characterEntity, loadMovies));
        }

        return dtos;
    }

    public List<CharacterEntity> characterDTOList2EntityList(List<CharacterDTO> dtos) {
        List<CharacterEntity> entities = new ArrayList<>();

        for (CharacterDTO dto : dtos) {
            entities.add(this.characterDTO2Entity(dto));
        }

        return entities;
    }

}


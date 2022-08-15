package com.alkemy.movies.api.service;

import com.alkemy.movies.api.dto.CharacterDTO;

import java.util.List;

public interface CharacterService {


    CharacterDTO saveCharacter(CharacterDTO dto);

    List<CharacterDTO> getAllCharacters();

    void deleteMovie(Long id);
}

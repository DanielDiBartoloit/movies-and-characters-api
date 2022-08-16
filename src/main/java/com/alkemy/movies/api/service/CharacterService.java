package com.alkemy.movies.api.service;

import com.alkemy.movies.api.dto.CharacterDTO;

import java.util.List;

public interface CharacterService {


    CharacterDTO saveCharacter(CharacterDTO dto);

    List<CharacterDTO> getAllCharacters();

    void deleteCharacter(Long id);

    CharacterDTO updateCharacter(Long id, CharacterDTO character);
}

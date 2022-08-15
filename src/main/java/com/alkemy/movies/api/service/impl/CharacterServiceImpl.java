package com.alkemy.movies.api.service.impl;

import com.alkemy.movies.api.dto.CharacterDTO;
import com.alkemy.movies.api.entity.CharacterEntity;
import com.alkemy.movies.api.mapper.CharacterMapper;
import com.alkemy.movies.api.repository.CharacterRepository;
import com.alkemy.movies.api.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    CharacterMapper characterMapper;

    @Autowired
    CharacterRepository characterRepository;

    @Override
    public CharacterDTO saveCharacter(CharacterDTO dto) {
        CharacterEntity entity = characterMapper.characterDTO2Entity(dto);
        CharacterEntity savedEntity = characterRepository.save(entity);
        CharacterDTO result = characterMapper.characterEntity2DTO(savedEntity);
        return result;
    }


}

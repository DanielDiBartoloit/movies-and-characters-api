package com.alkemy.movies.api.service.impl;

import com.alkemy.movies.api.dto.CharacterDTO;
import com.alkemy.movies.api.entity.CharacterEntity;
import com.alkemy.movies.api.exception.ParamNotFoundException;
import com.alkemy.movies.api.mapper.CharacterMapper;
import com.alkemy.movies.api.repository.CharacterRepository;
import com.alkemy.movies.api.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterMapper characterMapper;

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public CharacterDTO saveCharacter(CharacterDTO dto) {
        CharacterEntity entity = characterMapper.characterDTO2Entity(dto);
        CharacterEntity savedEntity = characterRepository.save(entity);
        CharacterDTO result = characterMapper.characterEntity2DTO(savedEntity, Boolean.TRUE);
        return result;
    }

    @Override
    public List<CharacterDTO> getAllCharacters() {
        List<CharacterEntity> entities = characterRepository.findAll();
        List<CharacterDTO> result = characterMapper.characterEntityList2DTOList(entities, Boolean.TRUE);
        return result;
    }

    @Override
    public void deleteCharacter(Long id) {

        Optional<CharacterEntity> characterOptional = characterRepository.findById(id);

        if (!characterOptional.isPresent()) {
            throw new ParamNotFoundException("The character with that id does not exist");
        }

        //TODO: Consultar esta forma si es valida
        //CharacterEntity characterEntity = characterRepository.findById(id)
                //.orElseThrow(() -> new ParamNotFoundException("The character with that id does not exist"));

        characterRepository.deleteById(id);
    }


    @Override
    public CharacterDTO updateCharacter(Long id, CharacterDTO characterDTO) {

        Optional<CharacterEntity> characterOptional = characterRepository.findById(id);

        if (!characterOptional.isPresent()) {
            throw new ParamNotFoundException("The character with that id does not exist");
        }

        CharacterEntity characterEntity = characterOptional.get();

        characterMapper.characterEntityRefreshValues(characterEntity, characterDTO);

        CharacterEntity savedEntity = characterRepository.save(characterEntity);

        CharacterDTO result = characterMapper.characterEntity2DTO(savedEntity, Boolean.TRUE);

        return result;

    }


}

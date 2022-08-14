package com.alkemy.movies.api.controller;


import com.alkemy.movies.api.dto.CharacterDTO;
import com.alkemy.movies.api.service.CharacterService;
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
@RequestMapping("characters")
@Getter
@Setter
public class CharacterController {

    //@Autowired
    //private CharacterService characterService;

    //@PostMapping
    //public ResponseEntity<CharacterDTO> saveCharacter(@RequestBody CharacterDTO character){
        //CharacterDTO savedCharacter = characterService.saveCharacter(character);
   //}


}

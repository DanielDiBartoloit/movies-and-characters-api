package com.alkemy.movies.api.dto;

import com.alkemy.movies.api.entity.CharacterEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class MovieDTO {
    private Long id;
    private String image;
    private String title;
    private Byte rating;
    private LocalDate creationDate;
    private Set<CharacterEntity> characters;
}




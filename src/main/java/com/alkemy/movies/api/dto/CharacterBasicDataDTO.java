package com.alkemy.movies.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterBasicDataDTO {
    private Long id;
    private String name;
    private Byte age;
    private Float weight;
}

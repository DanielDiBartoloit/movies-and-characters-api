package com.alkemy.movies.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterDTO {
    private Long id;
    private String image;
    private String name;
    private Byte age;
    private Float weight;
    private String story;
}

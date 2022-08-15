package com.alkemy.movies.api.dto;

import com.alkemy.movies.api.entity.MovieEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CharacterDTO {
    private Long id;
    private String image;
    private String name;
    private Byte age;
    private Float weight;
    private String story;
    private Set<MovieEntity> movies;
}

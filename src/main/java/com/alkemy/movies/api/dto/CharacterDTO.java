package com.alkemy.movies.api.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CharacterDTO {
    private Long id;
    private String image;
    @NotNull
    private String name;
    private Byte age;
    private Float weight;
    private String story;
    private List<MovieDTO> movies;
}

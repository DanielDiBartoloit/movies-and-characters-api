package com.alkemy.movies.api.dto;


import lombok.Getter;
import lombok.Setter;


import java.util.List;


@Getter
@Setter
public class MovieDTO {
    private Long id;
    private String image;
    private String title;
    private Byte rating;
    private String creationDate;
    private List<CharacterDTO> characters;
}




package com.alkemy.movies.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieDTO {
    private Long id;
    private String image;
    @NotNull
    private String title;
    @Min(value = 1, message = "rating should not be less than 1")
    @Max(value = 5, message = "rating should not be higher than 5")
    private Byte rating;
    private String creationDate;
    private List<CharacterDTO> characters;
}







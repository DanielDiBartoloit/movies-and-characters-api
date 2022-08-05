package com.alkemy.movies.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
@Getter
@Setter
public class GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private List<MovieEntity> movies = new ArrayList<>();

}


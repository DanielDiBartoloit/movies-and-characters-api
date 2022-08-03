package com.alkemy.movies.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "imagen")
    private String image;

    @Column(name = "nombre")
    private String name;

    @Column(name = "edad")
    private Long age;

    @Column(name = "peso")
    private String weight;

    @Column(name = "historia")
    private String history;

    @ManyToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private List<MovieEntity> movies = new ArrayList<>();

}


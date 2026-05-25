package com.davinchicoder.springgraphql.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Entity: representa el modelo interno/persistente (BD) con identidad y estado;
 * DTO: objeto ligero para transferir datos entre capas sin exponer la entidad
 * ni su lógica.
 */
@Data
@Builder
public class Videogame {

    private Long id;
    private String title;
    private ArrayList<String> genres;
    private int releaseYear;
    private String studio;
    private double price;
    private String description;
    private String ageRating;

}

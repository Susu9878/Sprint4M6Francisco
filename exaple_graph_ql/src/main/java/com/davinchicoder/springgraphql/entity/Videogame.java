package com.davinchicoder.springgraphql.entity;

import lombok.Builder;
import lombok.Data;

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
    private String genre;
    private int releaseYear;
    private String studio;
    private double price;
    private String description;
    private String ageRating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
}

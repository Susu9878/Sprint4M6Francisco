package com.davinchicoder.springgraphql.dto;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

/**
 * DTO (Data Transfer Object): objeto simple usado para transportar datos entre
 * capas
 * (ej. cliente ↔ servidor) sin exponer la entidad interna.
 */
@Data
@Builder
public class VideogameDTO {
    private String title;
    private String genre;
    private int releaseYear;
    private String studio;
    private double price;
    private String description;
    private String ageRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genre;
    }

    public void setGenres(String genre) {
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

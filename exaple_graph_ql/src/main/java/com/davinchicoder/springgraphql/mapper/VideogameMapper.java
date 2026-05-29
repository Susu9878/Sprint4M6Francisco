package com.davinchicoder.springgraphql.mapper;

import com.davinchicoder.springgraphql.dto.VideogameDTO;
import com.davinchicoder.springgraphql.entity.Videogame;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * Mapper que convierte un PostDto en una entidad Post para su procesamiento o
 * persistencia.
 */
@Component
public class VideogameMapper implements Function<VideogameDTO, Videogame> {

    @Override
    public Videogame apply(VideogameDTO postDto) {
        return Videogame.builder()
                .title(postDto.getTitle())
                .genre(postDto.getGenre())
                .releaseYear(postDto.getReleaseYear())
                .studio(postDto.getStudio())
                .price(postDto.getPrice())
                .description(postDto.getDescription())
                .ageRating(postDto.getAgeRating())
                .build();
    }
}

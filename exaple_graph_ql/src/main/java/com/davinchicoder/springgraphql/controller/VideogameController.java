package com.davinchicoder.springgraphql.controller;

import com.davinchicoder.springgraphql.dto.VideogameDTO;
import com.davinchicoder.springgraphql.entity.Videogame;
import com.davinchicoder.springgraphql.exception.VideogameNotFound;
import com.davinchicoder.springgraphql.mapper.VideogameMapper;
import com.davinchicoder.springgraphql.repository.VideogameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@Controller
@RequiredArgsConstructor
public class VideogameController {

    /** Repositorio para acceder y manipular datos de publicaciones. */
    private final VideogameRepository postRepository;

    /** Mapper para convertir PostDto a entidad Post. */
    private final VideogameMapper postMapper;

    @QueryMapping
    public List<Videogame> getPostsByGenre(@Argument String genre) {

        return postRepository.getPostsByGenre(genre);
    }

    /** Obtiene publicaciones recientes con paginación (count, offset). */
    @QueryMapping
    public List<Videogame> getRecentPosts(@Argument int count, @Argument int offset) {
        return postRepository.getRecentPosts(count, offset);
    }

    /** Obtiene una publicación por su ID o lanza PostNotFound. */
    @QueryMapping
    public Videogame getPostById(@Argument Long id) {
        return postRepository.getById(id).orElseThrow(VideogameNotFound::new);
    }

    /** Obtiene todas las publicaciones. */
    @QueryMapping
    public List<Videogame> getAllPosts() {
        return postRepository.getAll();
    }

    /** Elimina una publicación por ID o lanza PostNotFound. */
    @MutationMapping
    public Videogame deletePostById(@Argument Long id) {

        return postRepository.delete(id).orElseThrow(VideogameNotFound::new);
    }

    /** Guarda una nueva publicación a partir de PostDto. */
    @MutationMapping
    public Videogame savePost(@Argument VideogameDTO postDto) {
        Videogame post = postMapper.apply(postDto);
        return postRepository.save(post);
    }
}

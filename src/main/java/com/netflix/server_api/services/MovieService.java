package com.netflix.server_api.services;

import com.netflix.server_api.model.Movies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {
    List<Movies> findAll();

    List<Movies> search(String name);

    Movies createMovie(Movies movie);

    Movies update(Movies movie);

    Optional<Movies> findById(Long id);

    void delete(Long id);
}

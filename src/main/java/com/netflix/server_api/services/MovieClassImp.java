package com.netflix.server_api.services;

import com.netflix.server_api.model.MovieClass;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieClassImp implements MovieClassService{
    private final MovieClassService movieClassService;

    public MovieClassImp(MovieClassService movieClassService) {
        this.movieClassService = movieClassService;
    }

    @Override
    public List<MovieClass> findAll() {
        return null;
    }

    @Override
    public Optional<MovieClass> findById(Long id) {
        return Optional.empty();
    }
}

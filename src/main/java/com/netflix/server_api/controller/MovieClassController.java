package com.netflix.server_api.controller;

import com.netflix.server_api.model.MovieClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.netflix.server_api.services.MovieClassService;

import java.util.List;
import java.util.Optional;

public class MovieClassController {
    private final MovieClassService movieClassService;

    public MovieClassController(MovieClassService movieClassService) {
        this.movieClassService = movieClassService;
    }

    @GetMapping
    public List<MovieClass> findAll(){

        return movieClassService.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<MovieClass> findById(@PathVariable Long id){

        return movieClassService.findById(id);
    }
}

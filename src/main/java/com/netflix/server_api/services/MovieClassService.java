package com.netflix.server_api.services;

import com.netflix.server_api.model.MovieClass;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieClassService {
    List<MovieClass> findAll();

    Optional<MovieClass> findById(Long id);
}

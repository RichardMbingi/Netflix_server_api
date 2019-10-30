package com.netflix.server_api.repositories;

import com.netflix.server_api.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movies, Long> {
    Optional<Movies> findById(Long id);

    List<Movies> findByNameContaining(String name);
}

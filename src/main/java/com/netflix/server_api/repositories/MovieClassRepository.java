package com.netflix.server_api.repositories;

import com.netflix.server_api.model.MovieClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieClassRepository extends JpaRepository<MovieClass, Long> {
}

package com.netflix.server_api.services;

import com.netflix.server_api.model.Type;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TypeService {

    List<Type> findAll();

    Optional<Type> findById(Long id);
}
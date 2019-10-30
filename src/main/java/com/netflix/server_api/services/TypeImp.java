package com.netflix.server_api.services;

import com.netflix.server_api.model.Type;
import com.netflix.server_api.repositories.TypeRepository;

import java.util.List;
import java.util.Optional;

public class TypeImp implements TypeService{

    private final TypeRepository typeRepository;

    private TypeImp(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

    @Override
    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public Optional<Type> findById(Long id) {
        return typeRepository.findById(id);
    }
}

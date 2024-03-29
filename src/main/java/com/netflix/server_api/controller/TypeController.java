package com.netflix.server_api.controller;

import com.netflix.server_api.model.Type;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.server_api.services.TypeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "types")
public class TypeController {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }
    @GetMapping
    public List<Type> findAll(){
        return typeService.findAll();
    }
    @GetMapping(value = "{id}")
    public Optional<Type> findById(@PathVariable Long id){
        return typeService.findById(id);
    }
}
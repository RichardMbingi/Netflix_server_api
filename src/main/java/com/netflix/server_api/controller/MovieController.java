package com.netflix.server_api.controller;

import com.netflix.server_api.model.Movies;
import com.netflix.server_api.model.User;
import org.springframework.web.bind.annotation.*;
import com.netflix.server_api.services.MovieService;
import com.netflix.server_api.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "movies")

public class MovieController{
    private final MovieService movieService;
    private final UserService userService;

    public MovieController(MovieService movieService, UserService userService) {
        this.movieService = movieService;
        this.userService = userService;
    }

    @GetMapping
    public List<Movies> findAll(){return movieService.findAll();}

    @GetMapping(value = "search")
    public List<Movies> search(@RequestParam String name){return movieService.search(name);}

    @PostMapping
    public Movies createMovie(
            @RequestBody Movies movies,
            @RequestParam Integer idno
    ){
        User found = userService.findByIdNumber(idno);
        if (found.getIdNumber().equals(idno)){
            return movieService.createMovie(movies);
        }
        return null;
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id, @RequestParam Integer idno) {
        User foundUser = userService.findByIdNumber(idno);
        Optional<Movies> foundMovie = movieService.findById(id);
        if (foundMovie.isPresent()){
            if (foundUser.getId().equals(foundMovie.get().getUser().getId())){
                movieService.delete(id);
            }
        }
    }
}

package com.netflix.server_api.services;

import com.netflix.server_api.model.Movies;
import org.springframework.stereotype.Service;
import com.netflix.server_api.repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieImp implements MovieService{

    private final MovieRepository movieRepository;

    public MovieImp(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movies> findAll() {
        return null;
    }

    @Override
    public List<Movies> search(String name) {
        return null;
    }

    @Override
    public Movies createMovie(Movies movie) {
        return null;
    }

    @Override
    public Movies update(Movies movie) {
        Optional<Movies> found = findById(movie.getId());
        if (found.isPresent()) {
            Movies toedit = found.get();
            toedit.setMovieClass(movie.getMovieClass());
            toedit.setName(movie.getName());
            toedit.setType(movie.getType());
            toedit.setUser(movie.getUser());

            return movieRepository.save(toedit);
        }
        return null;
    }

    @Override
    public Optional<Movies> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

}

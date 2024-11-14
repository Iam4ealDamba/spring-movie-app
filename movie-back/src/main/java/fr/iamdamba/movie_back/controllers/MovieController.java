package fr.iamdamba.movie_back.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.iamdamba.movie_back.dtos.movies.MovieCreateDto;
import fr.iamdamba.movie_back.dtos.movies.MovieOneDto;
import fr.iamdamba.movie_back.dtos.movies.MovieUpdateDto;
import fr.iamdamba.movie_back.entities.Movie;

@RestController()
@RequestMapping("/api/movies")
public class MovieController {
    /** Get all movies */
    @GetMapping()
    public ResponseEntity<List<MovieOneDto>> all() {
        List<MovieOneDto> MovieOneDto = new ArrayList<>();
        return new ResponseEntity<>(MovieOneDto, HttpStatus.OK);
    }

    /**
     * Get one movies by id
     * 
     * @param id id of the movie (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<MovieOneDto> one(@PathVariable Long id) {
        MovieOneDto MovieOneDto = new MovieOneDto();
        return new ResponseEntity<>(MovieOneDto, HttpStatus.OK);
    }

    /**
     * Create a new movie
     * 
     * @param entity json of the movie (MovieCreateDto)
     */
    @PostMapping()
    public ResponseEntity<MovieOneDto> create(@RequestBody MovieCreateDto entity) {
        MovieOneDto newMovie = new MovieOneDto();
        return new ResponseEntity<>(newMovie, HttpStatus.OK);
    }

    /**
     * Update a movie
     * 
     * @param id     id of the movie (String)
     * @param entity json of the movie (MovieUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<MovieOneDto> putMethodName(@PathVariable String id, @RequestBody MovieUpdateDto entity) {

        MovieOneDto newMovie = new MovieOneDto();
        return new ResponseEntity<>(newMovie, HttpStatus.OK);
    }

    /**
     * Delete a movie
     * 
     * @param id id of the movie (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<MovieOneDto> deleteMethodName(@PathVariable String id) {
        MovieOneDto newMovie = new MovieOneDto();
        return new ResponseEntity<>(newMovie, HttpStatus.OK);
    }
}

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

import fr.iamdamba.movie_back.dtos.genres.GenreCreateDto;
import fr.iamdamba.movie_back.dtos.genres.GenreOneDto;
import fr.iamdamba.movie_back.dtos.genres.GenreUpdateDto;
import fr.iamdamba.movie_back.entities.Genre;

@RestController()
@RequestMapping("/api/genres")
public class GenreController {
    /** Get all genres */
    @GetMapping()
    public ResponseEntity<List<GenreOneDto>> all() {
        List<GenreOneDto> GenreOneDto = new ArrayList<>();
        return new ResponseEntity<>(GenreOneDto, HttpStatus.OK);
    }

    /**
     * Get one genres by id
     * 
     * @param id id of the genre (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<GenreOneDto> one(@PathVariable Long id) {
        GenreOneDto GenreOneDto = new GenreOneDto();
        return new ResponseEntity<>(GenreOneDto, HttpStatus.OK);
    }

    /**
     * Create a new genre
     * 
     * @param entity json of the genre (GenreCreateDto)
     */
    @PostMapping()
    public ResponseEntity<GenreOneDto> create(@RequestBody GenreCreateDto entity) {
        GenreOneDto newGenre = new GenreOneDto();
        return new ResponseEntity<>(newGenre, HttpStatus.OK);
    }

    /**
     * Update a genre
     * 
     * @param id     id of the genre (String)
     * @param entity json of the genre (GenreUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<GenreOneDto> putMethodName(@PathVariable String id, @RequestBody GenreUpdateDto entity) {

        GenreOneDto newGenre = new GenreOneDto();
        return new ResponseEntity<>(newGenre, HttpStatus.OK);
    }

    /**
     * Delete a genre
     * 
     * @param id id of the genre (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<GenreOneDto> deleteMethodName(@PathVariable String id) {
        GenreOneDto newGenre = new GenreOneDto();
        return new ResponseEntity<>(newGenre, HttpStatus.OK);
    }
}

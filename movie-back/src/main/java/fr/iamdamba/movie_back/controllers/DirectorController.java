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

import fr.iamdamba.movie_back.dtos.directors.DirectorCreateDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorOneDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorUpdateDto;

@RestController()
@RequestMapping("/api/directors")
public class DirectorController {
    /** Get all directors */
    @GetMapping()
    public ResponseEntity<List<DirectorOneDto>> all() {
        List<DirectorOneDto> ShowOneDto = new ArrayList<>();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Get one directors by id
     * 
     * @param id id of the director (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<DirectorOneDto> one(@PathVariable Long id) {
        DirectorOneDto ShowOneDto = new DirectorOneDto();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Create a new director
     * 
     * @param entity json of the director (StudioCreateDto)
     */
    @PostMapping()
    public ResponseEntity<DirectorOneDto> create(@RequestBody DirectorCreateDto entity) {
        DirectorOneDto newShow = new DirectorOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Update a director
     * 
     * @param id     id of the director (String)
     * @param entity json of the director (StudioUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<DirectorOneDto> putMethodName(@PathVariable String id,
            @RequestBody DirectorUpdateDto entity) {

        DirectorOneDto newShow = new DirectorOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Delete a director
     * 
     * @param id id of the director (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<DirectorOneDto> deleteMethodName(@PathVariable String id) {
        DirectorOneDto newShow = new DirectorOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }
}

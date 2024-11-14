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

import fr.iamdamba.movie_back.dtos.shows.ShowCreateDto;
import fr.iamdamba.movie_back.dtos.shows.ShowOneDto;
import fr.iamdamba.movie_back.dtos.shows.ShowUpdateDto;

@RestController()
@RequestMapping("/api/shows")
public class ShowController {
    /** Get all shows */
    @GetMapping()
    public ResponseEntity<List<ShowOneDto>> all() {
        List<ShowOneDto> ShowOneDto = new ArrayList<>();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Get one shows by id
     * 
     * @param id id of the show (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<ShowOneDto> one(@PathVariable Long id) {
        ShowOneDto ShowOneDto = new ShowOneDto();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Create a new show
     * 
     * @param entity json of the show (MovieCreateDto)
     */
    @PostMapping()
    public ResponseEntity<ShowOneDto> create(@RequestBody ShowCreateDto entity) {
        ShowOneDto newShow = new ShowOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Update a show
     * 
     * @param id     id of the show (String)
     * @param entity json of the show (MovieUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<ShowOneDto> putMethodName(@PathVariable String id, @RequestBody ShowUpdateDto entity) {

        ShowOneDto newShow = new ShowOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Delete a show
     * 
     * @param id id of the show (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<ShowOneDto> deleteMethodName(@PathVariable String id) {
        ShowOneDto newShow = new ShowOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

}

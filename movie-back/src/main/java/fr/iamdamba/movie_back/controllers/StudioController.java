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

import fr.iamdamba.movie_back.dtos.studios.StudioCreateDto;
import fr.iamdamba.movie_back.dtos.studios.StudioOneDto;
import fr.iamdamba.movie_back.dtos.studios.StudioUpdateDto;

@RestController()
@RequestMapping("/api/studios")
public class StudioController {
    /** Get all studios */
    @GetMapping()
    public ResponseEntity<List<StudioOneDto>> all() {
        List<StudioOneDto> ShowOneDto = new ArrayList<>();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Get one studios by id
     * 
     * @param id id of the studio (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<StudioOneDto> one(@PathVariable Long id) {
        StudioOneDto ShowOneDto = new StudioOneDto();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Create a new studio
     * 
     * @param entity json of the studio (StudioCreateDto)
     */
    @PostMapping()
    public ResponseEntity<StudioOneDto> create(@RequestBody StudioCreateDto entity) {
        StudioOneDto newShow = new StudioOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Update a studio
     * 
     * @param id     id of the studio (String)
     * @param entity json of the studio (StudioUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<StudioOneDto> putMethodName(@PathVariable String id, @RequestBody StudioUpdateDto entity) {

        StudioOneDto newShow = new StudioOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Delete a studio
     * 
     * @param id id of the studio (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<StudioOneDto> deleteMethodName(@PathVariable String id) {
        StudioOneDto newShow = new StudioOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

}

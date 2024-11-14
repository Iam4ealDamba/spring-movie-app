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

import fr.iamdamba.movie_back.dtos.actors.ActorCreateDto;
import fr.iamdamba.movie_back.dtos.actors.ActorOneDto;
import fr.iamdamba.movie_back.dtos.actors.ActorUpdateDto;

@RestController()
@RequestMapping("/api/actors")
public class ActorController {
    /** Get all actors */
    @GetMapping()
    public ResponseEntity<List<ActorOneDto>> all() {
        List<ActorOneDto> ActorOneDto = new ArrayList<>();
        return new ResponseEntity<>(ActorOneDto, HttpStatus.OK);
    }

    /**
     * Get one actors by id
     * 
     * @param id id of the actor (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<ActorOneDto> one(@PathVariable Long id) {
        ActorOneDto ActorOneDto = new ActorOneDto();
        return new ResponseEntity<>(ActorOneDto, HttpStatus.OK);
    }

    /**
     * Create a new actor
     * 
     * @param entity json of the actor (StudioCreateDto)
     */
    @PostMapping()
    public ResponseEntity<ActorOneDto> create(@RequestBody ActorCreateDto entity) {
        ActorOneDto newActor = new ActorOneDto();
        return new ResponseEntity<>(newActor, HttpStatus.OK);
    }

    /**
     * Update a actor
     * 
     * @param id     id of the actor (String)
     * @param entity json of the actor (StudioUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<ActorOneDto> putMethodName(@PathVariable String id, @RequestBody ActorUpdateDto entity) {

        ActorOneDto newActor = new ActorOneDto();
        return new ResponseEntity<>(newActor, HttpStatus.OK);
    }

    /**
     * Delete a actor
     * 
     * @param id id of the actor (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<ActorOneDto> deleteMethodName(@PathVariable String id) {
        ActorOneDto newActor = new ActorOneDto();
        return new ResponseEntity<>(newActor, HttpStatus.OK);
    }

}

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

import fr.iamdamba.movie_back.dtos.episodes.EpisodeCreateDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeOneDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeUpdateDto;
import fr.iamdamba.movie_back.entities.Episode;

@RestController()
@RequestMapping("/api/episodes")
public class EpisodeController {
    /** Get all episodes */
    @GetMapping()
    public ResponseEntity<List<EpisodeOneDto>> all() {
        List<EpisodeOneDto> EpisodeOneDto = new ArrayList<>();
        return new ResponseEntity<>(EpisodeOneDto, HttpStatus.OK);
    }

    /**
     * Get one episodes by id
     * 
     * @param id id of the episode (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<EpisodeOneDto> one(@PathVariable Long id) {
        EpisodeOneDto EpisodeOneDto = new EpisodeOneDto();
        return new ResponseEntity<>(EpisodeOneDto, HttpStatus.OK);
    }

    /**
     * Create a new episode
     * 
     * @param entity json of the episode (EpisodeCreateDto)
     */
    @PostMapping()
    public ResponseEntity<EpisodeOneDto> create(@RequestBody EpisodeCreateDto entity) {
        EpisodeOneDto newEpisode = new EpisodeOneDto();
        return new ResponseEntity<>(newEpisode, HttpStatus.OK);
    }

    /**
     * Update a episode
     * 
     * @param id     id of the episode (String)
     * @param entity json of the episode (EpisodeUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<EpisodeOneDto> putMethodName(@PathVariable String id, @RequestBody EpisodeUpdateDto entity) {

        EpisodeOneDto newEpisode = new EpisodeOneDto();
        return new ResponseEntity<>(newEpisode, HttpStatus.OK);
    }

    /**
     * Delete a episode
     * 
     * @param id id of the episode (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<EpisodeOneDto> deleteMethodName(@PathVariable String id) {
        EpisodeOneDto newEpisode = new EpisodeOneDto();
        return new ResponseEntity<>(newEpisode, HttpStatus.OK);
    }
}

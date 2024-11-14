package fr.iamdamba.movie_back.services._interfaces.studios;

import java.util.List;

import fr.iamdamba.movie_back.dtos.studios.StudioUpdateDto;
import fr.iamdamba.movie_back.dtos.studios.StudioCreateDto;
import fr.iamdamba.movie_back.dtos.studios.StudioOneDto;
import fr.iamdamba.movie_back.entities.Studio;

public interface StudioServiceInterface {
    /** Returns the studio with the given id */
    public StudioOneDto one(Long id);

    /** Returns all studios */
    public List<Studio> all();

    /** Create a new studio */
    public StudioOneDto create(StudioCreateDto entity);

    /** Update the studio with the given id */
    public StudioOneDto update(Long id, StudioUpdateDto entity);
}

package fr.iamdamba.movie_back.services._interfaces.directors;

import java.util.List;

import fr.iamdamba.movie_back.dtos.directors.DirectorCreateDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorOneDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorUpdateDto;
import fr.iamdamba.movie_back.entities.Director;

public interface DirectorServiceInterface {
    /** Returns the director with the given id */
    public DirectorOneDto one(Long id);

    /** Returns all directors */
    public List<Director> all();

    /** Create a new director */
    public DirectorOneDto create(DirectorCreateDto entity);

    /** Update the director with the given id */
    public DirectorOneDto update(Long id, DirectorUpdateDto entity);
}

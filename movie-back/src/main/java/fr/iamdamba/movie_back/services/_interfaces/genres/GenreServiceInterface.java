package fr.iamdamba.movie_back.services._interfaces.genres;

import java.util.List;

import fr.iamdamba.movie_back.dtos.genres.GenreCreateDto;
import fr.iamdamba.movie_back.dtos.genres.GenreOneDto;
import fr.iamdamba.movie_back.dtos.genres.GenreUpdateDto;
import fr.iamdamba.movie_back.entities.Genre;

public interface GenreServiceInterface {
    /** Returns the genre with the given id */
    public GenreOneDto one(Long id);

    /** Returns all genres */
    public List<Genre> all();

    /** Create a new genre */
    public GenreOneDto create(GenreCreateDto entity);

    /** Update the genre with the given id */
    public GenreOneDto update(Long id, GenreUpdateDto entity);
}

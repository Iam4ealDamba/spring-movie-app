package fr.iamdamba.movie_back.services._interfaces.shows;

import java.util.List;

import fr.iamdamba.movie_back.dtos.shows.ShowCreateDto;
import fr.iamdamba.movie_back.dtos.shows.ShowOneDto;
import fr.iamdamba.movie_back.dtos.shows.ShowUpdateDto;
import fr.iamdamba.movie_back.entities.Show;

public interface ShowServiceInterface {
    /** Returns the show with the given id */
    public ShowOneDto one(Long id);

    /** Returns all shows */
    public List<Show> all();

    /** Create a new show */
    public ShowOneDto create(ShowCreateDto entity);

    /** Update the show with the given id */
    public ShowOneDto update(Long id, ShowUpdateDto entity);
}

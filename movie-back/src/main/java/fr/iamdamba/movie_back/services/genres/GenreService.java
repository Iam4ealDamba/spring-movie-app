package fr.iamdamba.movie_back.services.genres;

import java.util.List;

import fr.iamdamba.movie_back.dtos.genres.GenreCreateDto;
import fr.iamdamba.movie_back.dtos.genres.GenreOneDto;
import fr.iamdamba.movie_back.dtos.genres.GenreUpdateDto;
import fr.iamdamba.movie_back.entities.Genre;
import fr.iamdamba.movie_back.services._interfaces.genres.GenreServiceInterface;

public class GenreService implements GenreServiceInterface {

    @Override
    public GenreOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Genre> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public GenreOneDto create(GenreCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public GenreOneDto update(Long id, GenreUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}

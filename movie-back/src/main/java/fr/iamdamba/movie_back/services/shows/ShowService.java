package fr.iamdamba.movie_back.services.shows;

import java.util.List;

import fr.iamdamba.movie_back.dtos.shows.ShowCreateDto;
import fr.iamdamba.movie_back.dtos.shows.ShowOneDto;
import fr.iamdamba.movie_back.dtos.shows.ShowUpdateDto;
import fr.iamdamba.movie_back.entities.Show;
import fr.iamdamba.movie_back.services._interfaces.shows.ShowServiceInterface;

public class ShowService implements ShowServiceInterface {

    @Override
    public ShowOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Show> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public ShowOneDto create(ShowCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ShowOneDto update(Long id, ShowUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}

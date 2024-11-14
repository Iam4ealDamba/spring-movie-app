package fr.iamdamba.movie_back.services.studios;

import java.util.List;

import fr.iamdamba.movie_back.dtos.studios.StudioUpdateDto;
import fr.iamdamba.movie_back.dtos.studios.StudioCreateDto;
import fr.iamdamba.movie_back.dtos.studios.StudioOneDto;
import fr.iamdamba.movie_back.entities.Studio;
import fr.iamdamba.movie_back.services._interfaces.studios.StudioServiceInterface;

public class StudioService implements StudioServiceInterface {

    @Override
    public StudioOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Studio> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public StudioOneDto create(StudioCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public StudioOneDto update(Long id, StudioUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}

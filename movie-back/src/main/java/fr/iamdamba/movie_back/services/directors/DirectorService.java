package fr.iamdamba.movie_back.services.directors;

import java.util.List;

import fr.iamdamba.movie_back.dtos.directors.DirectorCreateDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorOneDto;
import fr.iamdamba.movie_back.dtos.directors.DirectorUpdateDto;
import fr.iamdamba.movie_back.entities.Director;
import fr.iamdamba.movie_back.services._interfaces.directors.DirectorServiceInterface;

public class DirectorService implements DirectorServiceInterface {

    @Override
    public DirectorOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Director> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public DirectorOneDto create(DirectorCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public DirectorOneDto update(Long id, DirectorUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}

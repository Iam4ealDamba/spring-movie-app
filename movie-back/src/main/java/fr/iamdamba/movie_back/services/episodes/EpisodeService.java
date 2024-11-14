package fr.iamdamba.movie_back.services.episodes;

import java.util.List;

import fr.iamdamba.movie_back.dtos.episodes.EpisodeCreateDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeOneDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeUpdateDto;
import fr.iamdamba.movie_back.entities.Episode;
import fr.iamdamba.movie_back.services._interfaces.episodes.EpisodeServiceInterface;

public class EpisodeService implements EpisodeServiceInterface {

    @Override
    public EpisodeOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Episode> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public EpisodeOneDto create(EpisodeCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EpisodeOneDto update(Long id, EpisodeUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}

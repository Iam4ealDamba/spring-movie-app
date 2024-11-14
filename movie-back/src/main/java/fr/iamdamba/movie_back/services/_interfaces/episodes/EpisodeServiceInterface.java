package fr.iamdamba.movie_back.services._interfaces.episodes;

import java.util.List;

import fr.iamdamba.movie_back.dtos.episodes.EpisodeCreateDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeOneDto;
import fr.iamdamba.movie_back.dtos.episodes.EpisodeUpdateDto;
import fr.iamdamba.movie_back.entities.Episode;

public interface EpisodeServiceInterface {
    /** Returns the episode with the given id */
    public EpisodeOneDto one(Long id);

    /** Returns all episodes */
    public List<Episode> all();

    /** Create a new episode */
    public EpisodeOneDto create(EpisodeCreateDto entity);

    /** Update the episode with the given id */
    public EpisodeOneDto update(Long id, EpisodeUpdateDto entity);
}

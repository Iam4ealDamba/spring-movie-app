package fr.iamdamba.movie_back.services._interfaces.actors;

import java.util.List;

import fr.iamdamba.movie_back.dtos.actors.ActorCreateDto;
import fr.iamdamba.movie_back.dtos.actors.ActorOneDto;
import fr.iamdamba.movie_back.dtos.actors.ActorUpdateDto;
import fr.iamdamba.movie_back.entities.Actor;

public interface ActorServiceInterface {
    /** Returns the actor with the given id */
    public ActorOneDto one(Long id);

    /** Returns all actors */
    public List<Actor> all();

    /** Create a new actor */
    public ActorOneDto create(ActorCreateDto entity);

    /** Update the actor with the given id */
    public ActorOneDto update(Long id, ActorUpdateDto entity);
}

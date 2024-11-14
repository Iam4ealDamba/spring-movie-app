package fr.iamdamba.movie_back.services.actors;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.iamdamba.movie_back.dtos.actors.ActorCreateDto;
import fr.iamdamba.movie_back.dtos.actors.ActorOneDto;
import fr.iamdamba.movie_back.dtos.actors.ActorUpdateDto;
import fr.iamdamba.movie_back.entities.Actor;
import fr.iamdamba.movie_back.repositories.ActorRepository;
import fr.iamdamba.movie_back.services._interfaces.actors.ActorServiceInterface;

public class ActorService implements ActorServiceInterface {

    @Autowired
    private static ActorRepository actorRepository;

    @Override
    public ActorOneDto one(Long id) {
        List<Actor> actorList = actorRepository.findAll();
        Optional<Actor> OptionalActor = actorList.stream().filter(actor -> actor.getId() == id).findFirst();

        if (OptionalActor.isPresent()) {
            ActorOneDto actor = new ActorOneDto();
            actor.setFirstName(OptionalActor.get().getFirstName());
            actor.setLastName(OptionalActor.get().getLastName());
            actor.setBirthDate(OptionalActor.get().getBirthDate());
            actor.setImage(OptionalActor.get().getImage());
            return actor;
        } else {
            return null;
        }
    }

    @Override
    public List<Actor> all() {
        List<Actor> actorList = actorRepository.findAll();
        return actorList;
    }

    @Override
    public ActorOneDto create(ActorCreateDto entity) {
        Optional<Actor> oldActor = actorRepository.findAll().stream()
                .filter(actor -> actor.getFirstName().equals(entity.getFirstName())
                        && actor.getLastName().equals(entity.getLastName()))
                .findFirst();
        if (oldActor.isPresent()) {
            return null;
        } else {
            Actor actor = new Actor();
            ActorOneDto actorOneDto = new ActorOneDto();

            // Actor Registration
            actor.setFirstName(entity.getFirstName());
            actor.setLastName(entity.getLastName());
            actor.setBirthDate(entity.getBirthDate());
            actor.setImage(entity.getImage());
            actorRepository.save(actor);

            // Actor Dto
            actorOneDto.setFirstName(actor.getFirstName());
            actorOneDto.setLastName(actor.getLastName());
            actorOneDto.setBirthDate(actor.getBirthDate());
            actorOneDto.setImage(actor.getImage());
            return actorOneDto;
        }
    }

    @Override
    public ActorOneDto update(Long id, ActorUpdateDto entity) {
        if (oldActor.isPresent()) {
            return null;
        } else {
            Actor actor = new Actor();
            ActorOneDto actorOneDto = new ActorOneDto();

            // Actor Registration
            actor.setFirstName(entity.getFirstName());
            actor.setLastName(entity.getLastName());
            actor.setBirthDate(entity.getBirthDate());
            actor.setImage(entity.getImage());
            actorRepository.save(actor);

            // Actor Dto
            actorOneDto.setFirstName(actor.getFirstName());
            actorOneDto.setLastName(actor.getLastName());
            actorOneDto.setBirthDate(actor.getBirthDate());
            actorOneDto.setImage(actor.getImage());
            return actorOneDto;
        }
    }

}

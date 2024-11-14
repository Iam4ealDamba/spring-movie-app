package fr.iamdamba.movie_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.iamdamba.movie_back.entities.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
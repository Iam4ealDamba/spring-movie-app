package fr.iamdamba.movie_back.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Actor {
    /** Primary key of the actor */
    @Id
    @Column(name = "act_id")
    private Long id;
    /** Firstname of the actor */
    @Column(name = "act_first_name")
    private String firstName;
    /** Lastname of the actor */
    @Column(name = "act_last_name")
    private String lastName;
    /** Birthdate of the actor */
    @Column(name = "act_birth_date")
    private LocalDate birthDate;
    /** Image of the actor */
    @Column(name = "act_image")
    private String image;

    // Relationships

    /** Movies related to the actor */
    @ManyToMany
    @JoinTable(name = "actor_movie", joinColumns = @JoinColumn(name = "act_id"), inverseJoinColumns = @JoinColumn(name = "mov_id"))
    private Movie[] relatedMovies;
    /** TV Show related to the actor */
    @ManyToMany
    @JoinTable(name = "actor_show", joinColumns = @JoinColumn(name = "act_id"), inverseJoinColumns = @JoinColumn(name = "show_id"))
    private Show[] relatedShows;
}

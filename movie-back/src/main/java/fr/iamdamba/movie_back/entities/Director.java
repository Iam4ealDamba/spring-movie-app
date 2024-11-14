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
public class Director {
    /** Primary key of the director */
    @Id
    @Column(name = "dir_id")
    private Long id;
    /** Name of the director */
    @Column(name = "dir_firstName")
    private String firstName;
    /** Last name of the director */
    @Column(name = "dir_lastName")
    private String lastName;
    /** Birth date of the director */
    @Column(name = "dir_birthDate")
    private LocalDate birthDate;
    /** Image of the director */
    @Column(name = "dir_image")
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

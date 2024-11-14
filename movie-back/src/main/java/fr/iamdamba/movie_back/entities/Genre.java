package fr.iamdamba.movie_back.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Genre {
    /** The id of the genre */
    @Id
    @Column(name = "gen_id")
    private Integer id;
    /** The label of the genre */
    @Column(name = "gen_label")
    private String label;

    // Relationships
    /** The movie list of the genre */
    private Movie[] movies;
    /** The TV show list of the genre */
    private Show[] shows;
}

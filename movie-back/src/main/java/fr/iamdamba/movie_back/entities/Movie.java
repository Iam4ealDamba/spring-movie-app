package fr.iamdamba.movie_back.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Movie {
    /** primary key of the movie */
    @Id
    @Column(name = "mov_id")
    private Long id;
    /** title of the movie */
    @Column(name = "mov_title")
    private String title;
    /** description of the movie */
    @Column(name = "mov_description")
    private String description;
    /** year of the movie */
    @Column(name = "mov_year")
    private String year;
    /** genre of the movie */
    @Column(name = "mov_genre")
    private String[] genre;
    /** image of the movie */
    @Column(name = "mov_image")
    private String image;
    /** number of seasons of the movie */
    @Column(name = "mov_seasons")
    private String video;
    /** duration of the movie */
    @Column(name = "mov_duration")
    private Integer duration;

    // Relationships

    /** casting of the movie */
    @ManyToMany(mappedBy = "relatedMovies")
    private Actor[] casting;
    /** directors of the movie */
    @ManyToMany(mappedBy = "relatedMovies")
    private Director[] directors;
    /** studio of the movie */
    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;
    /** related movies of the movie */
    // @ManyToMany
    // @JoinTable(name = "movie_movie", joinColumns = @JoinColumn(name = "mov_id"),
    // inverseJoinColumns = @JoinColumn(name = "related_mov_id"))
    // private Movie[] relatedMovies;
}

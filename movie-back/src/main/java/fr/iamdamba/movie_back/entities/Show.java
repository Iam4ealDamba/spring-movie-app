package fr.iamdamba.movie_back.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Show {
    /** Id of the show */
    @Id
    @Column(name = "show_id")
    private Long id;
    /** Title of the show */
    @Column(name = "show_title")
    private String title;
    /** Description of the show */
    @Column(name = "show_description")
    private String description;
    /** Year of the show */
    @Column(name = "show_year")
    private String year;
    /** Genre of the show */
    @Column(name = "show_genre")
    private String[] genre;
    /** Image of the show */
    @Column(name = "show_image")
    private String image;
    /** Seasons of the show */
    @Column(name = "show_seasons")
    private Integer seasons;

    // Relationships

    /** Episodes of the show */
    @OneToMany(mappedBy = "show")
    private Episode[] episodes;
    /** casting of the movie */
    @ManyToMany(mappedBy = "relatedShows")
    private Actor[] casting;
    /** directors of the movie */
    @ManyToMany(mappedBy = "relatedShows")
    private Director[] directors;
    /** studios of the movie */
    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;
}

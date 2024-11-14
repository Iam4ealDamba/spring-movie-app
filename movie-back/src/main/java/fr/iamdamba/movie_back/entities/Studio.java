package fr.iamdamba.movie_back.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Studio {
    /** The id of the studio */
    @Id
    @Column(name = "studio_id")
    private Long id;
    /** The name of the studio */
    @Column(name = "studio_name")
    private String name;
    /** The description of the studio */
    @Column(name = "studio_description")
    private String description;
    /** The image of the studio */
    @Column(name = "studio_image")
    private String image;
    /** The creation date of the studio */
    @Column(name = "studio_creation_date")
    private LocalDate creationDate;

    // Relationships
    /** The movies of the studio */
    @OneToMany(mappedBy = "studio")
    private Movie[] movies;
    /** The shows of the studio */
    @OneToMany(mappedBy = "studio")
    private Show[] shows;

}

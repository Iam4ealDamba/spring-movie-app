package fr.iamdamba.movie_back.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Episode {
    /** Id of the episode */
    @Id
    @Column(name = "ep_id")
    private Long id;
    /** Title of the episode */
    @Column(name = "ep_title")
    private String title;
    /** Description of the episode */
    @Column(name = "ep_description")
    private String description;
    /** Duration of the episode */
    @Column(name = "ep_duration")
    private Integer duration;
    /** Video of the episode */
    @Column(name = "ep_video")
    private String video;
    /** Season of the episode */
    @Column(name = "ep_season")
    private String url;

    // Relationship
    /** Show of the episode */
    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
}

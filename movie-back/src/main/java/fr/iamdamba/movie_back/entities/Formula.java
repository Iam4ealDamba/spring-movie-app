package fr.iamdamba.movie_back.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

/** Represents a formula (or subscription) */
public class Formula {
    @Id
    private Integer id;

    private String title;

    private String description;

    private Float price;

    // Relationships
    @OneToMany(mappedBy = "formula")
    private List<Subscriber> subscribers;
}

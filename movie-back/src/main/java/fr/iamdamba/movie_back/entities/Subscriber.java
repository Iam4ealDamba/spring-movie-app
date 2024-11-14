package fr.iamdamba.movie_back.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

/** Represent a subscriber (application user) */
public class Subscriber {
    @Id
    private Long id;
    @Column(name = "sub_firstName", nullable = true)
    private String firstName;
    @Column(name = "sub_lastName", nullable = true)
    private String lastName;
    @Column(name = "sub_email", nullable = false)
    private String email;
    @Column(name = "sub_password", nullable = false)
    private String password;
    @Column(name = "sub_birthDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;
    @Column(name = "sub_isActivated", nullable = false)
    private Boolean isActivated = false;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "formula_id")
    private Member formula;
}

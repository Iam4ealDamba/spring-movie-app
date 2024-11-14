package fr.iamdamba.movie_back.entities;

import java.util.List;

import fr.iamdamba.movie_back.enums.RoleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

/** Representant a team member */
public class Member {
    /** Id of the member */
    @Id
    @Column(name = "mem_id")
    private Long id;
    /** First name of the member */
    @Column(name = "mem_firstName", nullable = false)
    private String firstName;
    /** Last name of the member */
    @Column(name = "mem_lastName", nullable = false)
    private String lastName;
    /** Email of the member */
    @Column(name = "mem_email", nullable = false)
    private String email;
    /** Password of the member */
    @Column(name = "mem_password", nullable = false)
    private String password;
    /** If the member is an admin */
    @Column(name = "mem_isAdmin", nullable = false)
    private Boolean isAdmin;
    /** Role of the member */
    @Column(name = "mem_role", nullable = false)
    private RoleEnum role;

    // Relationship
    /** Manager of the team */
    @ManyToOne
    @JoinColumn(name = "mem_manager_id")
    private Member manager;

    /** Team related to the manager */
    @OneToMany(mappedBy = "manager")
    private List<Member> team;
}

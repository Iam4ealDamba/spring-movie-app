package fr.iamdamba.movie_back.dtos.actors;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ActorOneDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String image;

}

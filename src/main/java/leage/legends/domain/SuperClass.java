package leage.legends.domain;


import leage.legends.enumLol.Difficulty;
import leage.legends.enumLol.Gender;
import leage.legends.enumLol.Role;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public abstract class SuperClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(min = 2,max = 25)
    @Column(unique = true)
    private String heroName;


    @NotNull
    private Gender gender;

    @NotNull
    private Difficulty difficulty;

    @NotNull
    private Role role;



}

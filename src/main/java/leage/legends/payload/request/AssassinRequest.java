package leage.legends.payload.request;

import leage.legends.enumLol.Difficulty;
import leage.legends.enumLol.Gender;
import leage.legends.enumLol.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AssassinRequest {


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

    @NotNull
    private String power;

}

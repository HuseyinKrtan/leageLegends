package leage.legends.payload.response;

import leage.legends.enumLol.Difficulty;
import leage.legends.enumLol.Gender;
import leage.legends.enumLol.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AssassinResponse {


    private String heroName;
    private Gender gender;
    private Difficulty difficulty;
    private Role role;
    private String power;

}

package leage.legends.service;

import leage.legends.domain.Assassin;
import leage.legends.payload.request.AssassinRequest;
import leage.legends.payload.response.AssassinResponse;
import leage.legends.repository.AssassinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AssassinService {

    private final AssassinRepository assassinRepository;

    public void save(AssassinRequest assassinRequest) {
        Assassin assassin =createAssassin(assassinRequest);
        assassinRepository.save(assassin);

    }

    private Assassin createAssassin(AssassinRequest assassinRequest) {
        return Assassin.builder()
                .heroName(assassinRequest.getHeroName())
                .gender(assassinRequest.getGender())
                .difficulty(assassinRequest.getDifficulty())
                .role(assassinRequest.getRole())
                .power(assassinRequest.getPower())
                .build();
    }

    public List<AssassinResponse> getAllAssassins() {
       return assassinRepository.findAll().stream().map(this::createAssassinResponse).collect(Collectors.toList());

    }

    private AssassinResponse createAssassinResponse (Assassin assassin){
        return  AssassinResponse.builder()
                .heroName(assassin.getHeroName())
                .gender(assassin.getGender())
                .difficulty(assassin.getDifficulty())
                .role(assassin.getRole())
                .power(assassin.getPower())
                .build();

    }
}

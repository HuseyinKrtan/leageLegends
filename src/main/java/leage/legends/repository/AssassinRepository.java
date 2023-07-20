package leage.legends.repository;

import leage.legends.domain.Assassin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssassinRepository extends JpaRepository<Assassin,Long> {
}

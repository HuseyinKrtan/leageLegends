package leage.legends.repository;

import leage.legends.domain.Magician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicianRepository extends JpaRepository<Magician,Long> {
}

package leage.legends.repository;

import leage.legends.domain.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository extends JpaRepository<Tank,Long> {
}

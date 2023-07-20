package leage.legends.repository;

import leage.legends.domain.Marksman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksmanRepository extends JpaRepository<Marksman,Long> {
}

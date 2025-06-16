package tn.esprit.equipee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.equipee.Entity.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}

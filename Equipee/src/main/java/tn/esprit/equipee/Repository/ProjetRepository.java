package tn.esprit.equipee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.equipee.Entity.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}

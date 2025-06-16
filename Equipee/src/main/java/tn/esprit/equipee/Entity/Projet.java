package tn.esprit.equipee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;
    private String sujet ;
    @OneToOne(cascade = CascadeType.ALL)
    private  ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets")
    List<Equipe> equipes;


}

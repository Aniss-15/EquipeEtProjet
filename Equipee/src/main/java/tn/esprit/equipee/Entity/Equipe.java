package tn.esprit.equipee.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domain DomainC;

    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER )
    private List<Projet> projets = new ArrayList<Projet>();

}

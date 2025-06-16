package tn.esprit.equipee.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Date;
@Entity
@Getter
@Setter
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjetDetail;
    private String description;
    private String technology;
    private Long Count ;
    private Date datedebut ;

    @OneToOne(mappedBy = "projetDetail") // Corrected to match field in Projet
    @ToStringExclude
    @JsonIgnore
    private Projet projet;


}

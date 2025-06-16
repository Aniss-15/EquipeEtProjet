package tn.esprit.equipee.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.equipee.Entity.Projet;
import tn.esprit.equipee.Services.ProjetInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Projet")
public class ProjetController {
    @Autowired
    ProjetInterface projetservice;

    @PostMapping("/add-Projet")
    public Projet addProjet(@RequestBody Projet p){
        Projet projet = projetservice.addProjet(p);
        return projet;
    }
    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjet() {
        return projetservice.retrieveAllProjet();
    }
    @PutMapping("/modify-projet")
    public Projet updateProjet(@RequestBody Projet p){
        return projetservice.modifyProjet(p);
    }
    @DeleteMapping("/delete-projet/{projet-id}")
    public void DeleteProjet(@PathVariable("projet-id") Long projetId) {
         projetservice.removeProjet(projetId);
    }

    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetservice.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }
    @PutMapping("/affecter-projet-equipe/{projet-id}/{equipe-id}")
    public void affecterProjetToEquip(@PathVariable("projet-id") Long proejtId,
                                       @PathVariable("equipe-id") Long proejtDetailsId) {
        projetservice.assignProjetToEquipe(proejtId, proejtDetailsId);
    }
    @PostMapping("/creer-projet-et-affecter-projet-detail-a-projet/{projetDetailId}")
    public void addProjetAndAssignProjetToProjetDetail(@RequestBody Projet projet,
                                                       @PathVariable Long projetDetailId) {
        projetservice.addProjetAndAssignProjetToProjetDetail(projet, projetDetailId);
    }

    @PutMapping("/desaffecter-projet-detail/{projetId}")
    public void desaffecterProjetDetailFromProjet(@PathVariable Long projetId) {
        projetservice.DesaffecterProjetDetailFromProjet(projetId);
    }


    @PutMapping("/desaffecter-projet-de-equipe/{projetId}/{equipeId}")
    public void desaffecterProjetFromEquipe(@PathVariable Long projetId,
                                            @PathVariable Long equipeId) {
        projetservice.desaffecterProjetFromEquipe(projetId, equipeId);
    }

}

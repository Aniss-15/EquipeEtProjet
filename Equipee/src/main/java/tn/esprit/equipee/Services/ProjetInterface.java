package tn.esprit.equipee.Services;

import tn.esprit.equipee.Entity.Projet;

import java.util.List;

public interface ProjetInterface {
    public List<Projet> retrieveAllProjet();
    public Projet retrieveProjet(Long idProjet);
    public Projet addProjet(Projet p);
    public void removeProjet(Long idProjet);
    public Projet modifyProjet(Projet p);
    /*public Projet addProjetAndProjetDetailAndAssign(Projet projet);*/
    public void assignProjetDetailToProjet(Long idProjet, Long idProjetDetail);
    public void assignProjetToEquipe(Long projetId, Long equipeId);
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);
    public Projet DesaffecterProjetDetailFromProjet(Long projetId);
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId);
}

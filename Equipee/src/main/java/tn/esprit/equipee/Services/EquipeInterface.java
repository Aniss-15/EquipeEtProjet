package tn.esprit.equipee.Services;

import tn.esprit.equipee.Entity.Equipe;
import tn.esprit.equipee.Entity.Projet;

import java.util.List;

public interface EquipeInterface {
    public List<Equipe> retrieveAllEquipes();
    public Equipe retrieveEquipes(Long id);
    public Equipe addEquipe(Equipe equipe);
    public void removeequipe(Long id);
    public Equipe modifyEquipe(Equipe equipe);
}

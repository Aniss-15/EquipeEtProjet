package tn.esprit.equipee.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.equipee.Entity.Equipe;
import tn.esprit.equipee.Entity.Projet;
import tn.esprit.equipee.Entity.ProjetDetail;
import tn.esprit.equipee.Repository.EquipeRepository;
import tn.esprit.equipee.Repository.ProjetDetailRepository;
import tn.esprit.equipee.Repository.ProjetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetServiceImpl implements ProjetInterface{
    @Autowired
    ProjetRepository projetRepository;
    ProjetDetailRepository projetDetailRepository;
    EquipeRepository equipeRepository;

    @Override
    public List<Projet> retrieveAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(Long idProjet) {
        return projetRepository.findById(idProjet).get();
    }

    @Override
    public Projet addProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public void removeProjet(Long idProjet) {
         projetRepository.deleteById(idProjet);
    }

    @Override
    public Projet modifyProjet(Projet p) {
        return  projetRepository.save(p);
    }

    @Override
    public void assignProjetDetailToProjet(Long idProjet, Long idProjetDetail) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(idProjetDetail).get();
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on set le fils dans le parent :
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

    @Override
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    @Override
    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }

    @Override
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on enlève le fils du parent :
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }

}

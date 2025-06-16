package tn.esprit.equipee.Services;

import tn.esprit.equipee.Entity.ProjetDetail;

import java.util.List;

public interface ProjetDetailInterface {
    public List<ProjetDetail> retrieveAllProjetDetails();
    public ProjetDetail retrieveProjetDetail(Long id);
    public ProjetDetail addProjetDetail(ProjetDetail Pd);
    public ProjetDetail modifyProjetDetail(ProjetDetail Pd);
    public void removeProjetDetail(Long id);
}

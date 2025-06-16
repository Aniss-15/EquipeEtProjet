package tn.esprit.equipee.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.equipee.Entity.ProjetDetail;
import tn.esprit.equipee.Repository.ProjetDetailRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProjetDetailIServiceImpl implements ProjetDetailInterface{
    @Autowired
    ProjetDetailRepository projetDetailRepository;

    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retrieveProjetDetail(Long id) {
        return projetDetailRepository.findById(id).get();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail Pd) {
        return projetDetailRepository.save(Pd);
    }

    @Override
    public void removeProjetDetail(Long id) {
        projetDetailRepository.deleteById(id);
    }
}

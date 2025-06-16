package tn.esprit.equipee.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.equipee.Entity.Equipe;
import tn.esprit.equipee.Repository.EquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipeServiceImpl implements EquipeInterface {
    @Autowired
     EquipeRepository equipeRepository;


    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipes(Long id) {
        return equipeRepository.findById(id).get();
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void removeequipe(Long id){
        equipeRepository.deleteById(id);
    }

    @Override
    public Equipe modifyEquipe(Equipe equipe) {
        if (equipeRepository.existsById(equipe.getId())) {
            return equipeRepository.save(equipe);
        }
        return null;
    }
}

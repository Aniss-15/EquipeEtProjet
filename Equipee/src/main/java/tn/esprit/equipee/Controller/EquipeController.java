package tn.esprit.equipee.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.equipee.Entity.Equipe;
import tn.esprit.equipee.Services.EquipeInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    EquipeInterface equipeInterface;

    @GetMapping("/retrive-all-equipe")
    public List<Equipe> retriveAllEquipe() {
        return equipeInterface.retrieveAllEquipes();
    }

    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long equipeId) {
        return equipeInterface.retrieveEquipes(equipeId);
    }

    @DeleteMapping("/Delete-equipe/{equipe-id}")
    public void DeleteEquipe(@PathVariable("equipe-id") Long equipeId) {
        equipeInterface.removeequipe(equipeId);
    }
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe equipe) {

        return equipeInterface.addEquipe(equipe);
    }


}

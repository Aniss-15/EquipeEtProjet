package tn.esprit.equipee.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.equipee.Entity.ProjetDetail;
import tn.esprit.equipee.Services.ProjetDetailInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ProjetDetaill")
public class ProjetDetailController {
    @Autowired
    ProjetDetailInterface projetDetail;
    @PostMapping("/add-projetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetdetail) {
        return projetDetail.addProjetDetail(projetdetail);
    }
    @GetMapping("/retrieve-all-projetdetails")
    public List<ProjetDetail> getProjetDetails() {
        return projetDetail.retrieveAllProjetDetails();
    }

    @GetMapping("/retrieve-projetdetail/{projetdetail-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("projetdetail-id") Long projetDetailId) {
        return projetDetail.retrieveProjetDetail(projetDetailId);
    }
    @PutMapping("/modify-projetdetail")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail projetdetail) {
        return projetDetail.modifyProjetDetail(projetdetail);
    }

    @DeleteMapping("/delete-projet/{projet-id}")
    public void DeleteProjet(@PathVariable("projet-id") Long projetId) {
        projetDetail.removeProjetDetail(projetId);
    }


}

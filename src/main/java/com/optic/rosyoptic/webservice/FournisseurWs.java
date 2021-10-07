package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Fournisseur;
import com.optic.rosyoptic.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fournisseur/fournisseur")
@CrossOrigin("http://localhost:4200")
public class FournisseurWs {

    @GetMapping("/name/{name}")
    public Fournisseur findByName(@PathVariable String name) {
        return fournisseurService.findByName(name);
    }

    @GetMapping("/telephone/{telephone}")
    public Fournisseur findByTelephone(@PathVariable String telephone) {
        return fournisseurService.findByTelephone(telephone);
    }


    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }

    @Autowired
    private FournisseurService fournisseurService;
}

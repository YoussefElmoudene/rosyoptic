package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Paiement;
import com.optic.rosyoptic.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paiement-fornisseur/paiement-fornisseur")
@CrossOrigin("http://localhost:4200")
public class PaiementWs {


    @GetMapping("/")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }

    @Autowired
    private PaiementService paiementService;
}

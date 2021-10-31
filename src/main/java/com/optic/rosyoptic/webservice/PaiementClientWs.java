package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.PaiementClient;
import com.optic.rosyoptic.service.PaiementClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("paiement-client/paiement-client")
@CrossOrigin("http://localhost:4200")
public class PaiementClientWs {

    @GetMapping("/nom/{nom}/prenom/{prenom}")
    public List<PaiementClient> findByClientNomAndClientPrenom(@PathVariable String nom,@PathVariable String prenom) {
        return paiementClientService.findByClientNomAndClientPrenom(nom, prenom);
    }

    @GetMapping("/date/{date}")
    public PaiementClient findByDate(@PathVariable Date date) {
        return paiementClientService.findByDate(date);
    }

    @GetMapping("/")
    public List<PaiementClient> findAll() {
        return paiementClientService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody PaiementClient paiementClient) {
        return paiementClientService.save(paiementClient);
    }

    @Autowired
    private PaiementClientService paiementClientService;
}

package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Fournisseur;
import com.optic.rosyoptic.bean.Paiement;
import com.optic.rosyoptic.repository.PaiementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService {

    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }

    public int save(Paiement paiement) {
        Fournisseur fournisseur = this.fournisseurService.findFournisseurById(paiement.getFournisseur().getId());
        if (fournisseur == null) {
            return -1;
        } else {
            paiement.setFournisseur(fournisseur);
            paiementDao.save(paiement);
            return 0;
        }
    }

    @Autowired
    private PaiementDao paiementDao;
    @Autowired
    private FournisseurService fournisseurService;
}

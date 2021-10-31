package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Client;
import com.optic.rosyoptic.bean.Fournisseur;
import com.optic.rosyoptic.bean.Verres;
import com.optic.rosyoptic.repository.VerresDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerreService {

    public List<Verres> findByMarque(String marque) {
        return verresDao.findByMarque(marque);
    }

    public Verres findVerresById(Long id) {
        return verresDao.findVerresById(id);
    }

    public List<Verres> findAll() {
        return verresDao.findAll();
    }

    public int save(Verres verres) {
        Fournisseur fournisseur = this.fournisseurService.findFournisseurById(verres.getFournisseur().getId());
        if (fournisseur == null) {
            return -1;
        } else {
            verres.setFournisseur(fournisseur);
            verresDao.save(verres);
            return 0;
        }
    }

    @Autowired
    private VerresDao verresDao;
    @Autowired
    private FournisseurService fournisseurService;
    @Autowired
    private ClientService clientService;
}

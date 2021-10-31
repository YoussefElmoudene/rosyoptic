package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Client;
import com.optic.rosyoptic.bean.Fournisseur;
import com.optic.rosyoptic.bean.Montures;
import com.optic.rosyoptic.repository.MonturesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MontureService {


    public List<Montures> findAll() {
        return monturesDao.findAll();
    }

    public List<Montures> findByMarque(String marque) {
        return monturesDao.findByMarque(marque);
    }

    public List<Montures> findBySeries(String series) {
        return monturesDao.findBySeries(series);
    }

    public List<Montures> findByEtat(String etat) {
        return monturesDao.findByEtat(etat);
    }

    public Montures findMonturesById(Long id) {
        return monturesDao.findMonturesById(id);
    }

    public int save(Montures montures) {
        Fournisseur fournisseur = this.fourService.findFournisseurById(montures.getFournisseur().getId());
        if (fournisseur == null) {
            return -1;
        } else {
            montures.setFournisseur(fournisseur);
            monturesDao.save(montures);
            return 0;
        }
    }

    @Autowired
    private MonturesDao monturesDao;
    @Autowired
    private FournisseurService fourService;
    @Autowired
    private ClientService clientService;
}

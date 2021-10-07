package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Fournisseur;
import com.optic.rosyoptic.bean.LunetteSoleil;
import com.optic.rosyoptic.repository.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {


    public Fournisseur findByName(String name) {
        return fournisseurDao.findByName(name);
    }

    public Fournisseur findByTelephone(String telephone) {
        return fournisseurDao.findByTelephone(telephone);
    }

    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }


    public int save(Fournisseur fournisseur) {
        fournisseurDao.save(fournisseur);
        return 0;
    }

    @Autowired
    private FournisseurDao fournisseurDao;
}

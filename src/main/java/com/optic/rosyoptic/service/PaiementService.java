package com.optic.rosyoptic.service;

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
         paiementDao.save(paiement);
        return 0;
    }

    @Autowired
    private PaiementDao paiementDao;
}

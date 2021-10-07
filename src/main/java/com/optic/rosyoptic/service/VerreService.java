package com.optic.rosyoptic.service;

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

    public List<Verres> findBySeries(String series) {
        return verresDao.findBySeries(series);
    }

    public List<Verres> findByEtat(String etat) {
        return verresDao.findByEtat(etat);
    }

    public List<Verres> findAll() {
        return verresDao.findAll();
    }

    public int save(Verres verres) {
        verresDao.save(verres);
        return 0;
    }

    @Autowired
    private VerresDao verresDao;
}

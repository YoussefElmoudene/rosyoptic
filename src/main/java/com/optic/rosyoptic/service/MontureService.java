package com.optic.rosyoptic.service;

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

    public int save(Montures montures) {
         monturesDao.save(montures);
        return 0;
    }

    @Autowired
    private MonturesDao monturesDao;
}

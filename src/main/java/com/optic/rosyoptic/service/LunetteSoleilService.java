package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.LunetteSoleil;
import com.optic.rosyoptic.repository.LunetteSoleilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LunetteSoleilService {

    public List<LunetteSoleil> findByMarque(String marque) {
        return lunetteSoleilDao.findByMarque(marque);
    }

    public List<LunetteSoleil> findBySeries(String series) {
        return lunetteSoleilDao.findBySeries(series);
    }

    public List<LunetteSoleil> findByEtat(String etat) {
        return lunetteSoleilDao.findByEtat(etat);
    }

    public List<LunetteSoleil> findAll() {
        return lunetteSoleilDao.findAll();
    }

    public int save(LunetteSoleil lunetteSoleil) {
         lunetteSoleilDao.save(lunetteSoleil);
        return 0;
    }

    @Autowired
    private LunetteSoleilDao lunetteSoleilDao;
}

package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Client;
import com.optic.rosyoptic.bean.Mesure;
import com.optic.rosyoptic.repository.MesureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesureService {


    public List<Mesure> findByClientNomAndClientPrenom(String nom, String prenom) {
        return mesureDao.findByClientNomAndClientPrenom(nom, prenom);
    }

    public List<Mesure> findByAxe(double axe) {
        return mesureDao.findByAxe(axe);
    }

    public List<Mesure> findAll() {
        return mesureDao.findAll();
    }

    public int save(Mesure mesure) {
        Client client = this.clientService.findByNomAndPrenom(mesure.getClient().getNom(), mesure.getClient().getPrenom());
        if (client == null){
            return -1;
        }
        else{
            mesure.setClient(client);
            mesureDao.save(mesure);
            return 1;
        }
    }

    @Autowired
    private MesureDao mesureDao;
    @Autowired
    private ClientService clientService;
}

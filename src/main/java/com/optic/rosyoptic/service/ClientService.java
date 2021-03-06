package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.Client;
import com.optic.rosyoptic.repository.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    public Client findClientById(Long id) {
        return clientDao.findClientById(id);
    }

    public Client findByNomAndPrenom(String nom, String prenom) {
        return clientDao.findByNomAndPrenom(nom, prenom);
    }

    public Client findByTele(String tele) {
        return clientDao.findByTele(tele);
    }

    public Client findByEmail(String email) {
        return clientDao.findByEmail(email);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public Optional<Client> findById(Long id) {
        return clientDao.findById(id);
    }

    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Autowired
    private ClientDao clientDao;
    @Autowired
    private MontureService montureService;
}

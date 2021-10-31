package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
     Client findByNomAndPrenom(String nom, String prenom);

    Client findByTele(String tele);
    Client findClientById( Long id);
    Client findByEmail(String email);
}

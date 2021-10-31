package com.optic.rosyoptic.repository;
import com.optic.rosyoptic.bean.PaiementClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PaiementClientDao extends JpaRepository<PaiementClient,Long> {

    List<PaiementClient> findByClientNomAndClientPrenom(String nom , String prenom);
    PaiementClient findByDate(Date date);
    PaiementClient findByReference( String reference);
}

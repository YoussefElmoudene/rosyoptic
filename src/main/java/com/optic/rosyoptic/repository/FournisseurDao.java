package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {
    Fournisseur findByName(String name);
    Fournisseur findByTelephone(String telephone);
    Fournisseur findFournisseurById(Long id);
}

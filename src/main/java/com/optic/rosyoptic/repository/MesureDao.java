package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Mesure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MesureDao extends JpaRepository<Mesure, Long> {
    List<Mesure>  findByAxe(double axe); // findByDate
    List<Mesure> findByClientNomAndClientPrenom(String nom, String prenom);
}

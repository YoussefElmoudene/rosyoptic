package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDao extends JpaRepository<Paiement,Long> {
}

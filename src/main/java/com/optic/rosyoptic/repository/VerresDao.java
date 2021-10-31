package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Verres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VerresDao extends JpaRepository<Verres,Long> {
    List<Verres> findByMarque(String marque);
    Verres findVerresById(Long id);
}

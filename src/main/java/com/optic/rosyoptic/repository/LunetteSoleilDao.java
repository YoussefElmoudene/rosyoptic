package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.LunetteSoleil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LunetteSoleilDao extends JpaRepository<LunetteSoleil,Long> {
    List<LunetteSoleil> findByMarque(String marque);
    List<LunetteSoleil> findBySeries(String series);
    List<LunetteSoleil> findByEtat(String etat);
    LunetteSoleil findLunetteSoleilById(Long id);
}

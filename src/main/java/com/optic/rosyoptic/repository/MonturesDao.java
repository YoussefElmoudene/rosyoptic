package com.optic.rosyoptic.repository;

import com.optic.rosyoptic.bean.Montures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonturesDao extends JpaRepository<Montures,Long> {
    List<Montures>  findByMarque(String marque);
    List<Montures>  findBySeries(String series);
    List<Montures>  findByEtat(String etat);

}

package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.LunetteSoleil;
import com.optic.rosyoptic.service.LunetteSoleilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lunette-soleil/lunette-soleil")
@CrossOrigin("http://localhost:4200")
public class LunetteSoleilWs {


    @GetMapping("/marque/{marque}")
    public List<LunetteSoleil> findByMarque(@PathVariable String marque) {
        return lunetteSoleilService.findByMarque(marque);
    }
    @GetMapping("/series/{series}")
    public List<LunetteSoleil> findBySeries(@PathVariable String series) {
        return lunetteSoleilService.findBySeries(series);
    }
    @GetMapping("/etat/{etat}")
    public List<LunetteSoleil> findByEtat(@PathVariable String etat) {
        return lunetteSoleilService.findByEtat(etat);
    }
    @GetMapping("/")
    public List<LunetteSoleil> findAll() {
        return lunetteSoleilService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody LunetteSoleil lunetteSoleil) {
        return lunetteSoleilService.save(lunetteSoleil);
    }

    @Autowired
    private LunetteSoleilService lunetteSoleilService;
}

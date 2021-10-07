package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Montures;
import com.optic.rosyoptic.service.MontureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("monture/monture")
@CrossOrigin("http://localhost:4200")
public class MontureWs {

    @GetMapping("/")
    public List<Montures> findAll() {
        return montureService.findAll();
    }

    @GetMapping("/marque/{marque}")
    public List<Montures> findByMarque(@PathVariable String marque) {
        return montureService.findByMarque(marque);
    }

    @GetMapping("/series/{series}")
    public List<Montures> findBySeries(@PathVariable String series) {
        return montureService.findBySeries(series);
    }

    @GetMapping("/etat/{etat}")
    public List<Montures> findByEtat(@PathVariable String etat) {
        return montureService.findByEtat(etat);
    }

    @PostMapping("/")
    public int save(@RequestBody Montures montures) {
        return montureService.save(montures);
    }

    @Autowired
    private MontureService montureService;
}

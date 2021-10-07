package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Mesure;
import com.optic.rosyoptic.service.MesureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mesure/mesure")
@CrossOrigin("http://localhost:4200")
public class MesureWs {

    @GetMapping("/axe/{axe}")
    public List<Mesure> findByAxe(@PathVariable double axe) {
        return mesureService.findByAxe(axe);
    }

    @GetMapping("/")
    public List<Mesure> findAll() {
        return mesureService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Mesure mesure) {
        return mesureService.save(mesure);
    }

    @Autowired
    private MesureService mesureService;
}

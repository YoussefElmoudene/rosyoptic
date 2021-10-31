package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Verres;
import com.optic.rosyoptic.service.VerreService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("verres/verres")
@CrossOrigin("http://localhost:4200")
public class VerreWs {


    @GetMapping("/marque/{marque}")
    public List<Verres> findByMarque(@PathVariable String marque) {
        return verreService.findByMarque(marque);
    }


    @GetMapping("/")
    public List<Verres> findAll() {
        return verreService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Verres verres) {
        return verreService.save(verres);
    }

    @Autowired
    private VerreService verreService;
}

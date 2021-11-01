package com.optic.rosyoptic.webservice;

import com.optic.rosyoptic.bean.Client;
import com.optic.rosyoptic.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client/client")
@CrossOrigin("http://localhost:4200")
public class ClientWs {


    @GetMapping("/nom/{nom}/prenom/{prenom}")
    public Client findByNomAndPrenom(@PathVariable String nom, @PathVariable String prenom) {
        return clientService.findByNomAndPrenom(nom, prenom);
    }

    @GetMapping("/tele/{tele}")
    public Client findByTele(@PathVariable String tele) {
        return clientService.findByTele(tele);
    }

    @GetMapping("/email/{email}")
    public Client findByEmail(@PathVariable String email) {
        return clientService.findByEmail(email);
    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @GetMapping("/id/{id}")
    public Client findClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }

    @Autowired
    private ClientService clientService;
}

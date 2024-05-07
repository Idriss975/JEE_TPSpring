package com.idriss.webservice.controller;


import com.idriss.webservice.entity.Compte;
import com.idriss.webservice.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BanqueRestService {

    @Autowired
    CompteRepository compteRepository;

    @GetMapping("convert/{montant}")
    public double conversion(@PathVariable("montant") Double montant) {
        return montant * 10.13;
    }

    @GetMapping("compte/{code}")
    public Compte getCompte(@PathVariable("code") Integer code) {
        return compteRepository.findById(code).get();
    }
    @GetMapping("comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @PostMapping("comptes")
    public Compte addAccount(@RequestBody Compte compte ){
        return compteRepository.save(compte);
    }
}

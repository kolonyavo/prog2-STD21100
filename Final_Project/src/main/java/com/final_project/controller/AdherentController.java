package com.final_project.controller;

import com.final_project.model.Adherent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.repository.AdherentRepository;

import java.util.List;

@RestController
public class AdherentController {
    @Autowired
    public AdherentRepository repository;

    @GetMapping("/adherent")
    public List<Adherent> findAdherent(@RequestParam(name = "first_name", required = false) String first_name,
                                       @RequestParam(name = "last_name", required = false) String last_name,
                                       @RequestParam(name = "status", required = false) boolean status){
        if(first_name != null){
            return repository.findAllByFirstName(first_name);
        }else if (last_name != null){
            return repository.findAllByLastName(last_name);
        }else if(status = true || false){
            return repository.findAllByStatus(status);
        }
        else{
        return repository.findAll();}
        }

    public List<Adherent> filterByName(@RequestParam(name = "first_name") String firstName){
        return repository.findAllByFirstName(firstName);
    }

    @PutMapping("/adherent/add")
    public Adherent CreateOrUpdateAdherent(Adherent adherent) {
        return repository.save(adherent);
    }

    @GetMapping("/adherent/{id_adherent}")
    public List<Adherent> findAdherentByID(@PathVariable Integer id_adherent){
        return repository.findAdherentByIdAdherent(id_adherent);
    }

    @DeleteMapping("/adherents/{id_adherent}")
    public Adherent deleteAdherentByID(@PathVariable Integer id_adherent){
        return repository.deleteAdherentByIdAdherent(id_adherent);
    }

}

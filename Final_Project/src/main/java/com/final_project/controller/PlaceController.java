package com.final_project.controller;

import com.final_project.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.repository.PlaceRepository;

import java.util.List;

@RestController
public class PlaceController {
    @Autowired
    private PlaceRepository repository;

    @GetMapping("/place")
    public List<Place> findPlace(){
        return repository.findAll();
    }

    @PutMapping("/place/add")
    public Place CreateOrUpdatePlace(Place place) {
        return repository.save(place);
    }

    @GetMapping("/place/{id_place}")
    public List<Place> findPlaceByID(@PathVariable Integer id_place){
        return repository.findPlaceByIdPlace(id_place);
    }

    @DeleteMapping("/places/{id_place}")
    public Place deletePlaceByID(@PathVariable Integer id_place){
        return repository.deletePlaceByIdPlace(id_place);
    }
}

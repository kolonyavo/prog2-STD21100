package com.final_project.repository;

import com.final_project.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository  extends JpaRepository<Place, Integer> {
    List<Place> findPlaceByIdPlace(Integer idPlace);
    Place deletePlaceByIdPlace(Integer idPlace);
}

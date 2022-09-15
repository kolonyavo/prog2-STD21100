package com.final_project.repository;

import com.final_project.model.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdherentRepository extends JpaRepository<Adherent, Integer> {
    List<Adherent> findAdherentByIdAdherent(Integer idAdherent);
    List<Adherent> findAllByFirstName(String firsName);
    List<Adherent> findAllByLastName(String lastName);
    List<Adherent> findAllByStatus(boolean status);

    Adherent deleteAdherentByIdAdherent(Integer idAdherent);

}

package com.final_project.repository;

import com.final_project.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Integer> {
    List<Session> findSessionByIdSession(Integer idSession);
    Session deleteSessionByIdSession(Integer idSession);
}

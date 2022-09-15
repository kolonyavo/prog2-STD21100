package com.final_project.controller;

import com.final_project.model.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.repository.SessionRepository;

import java.util.List;

@RestController
public class SessionController {
    @Autowired
    private SessionRepository repository;

    @GetMapping("/session")
    public List<Session> finSession(){
        return repository.findAll();
    }

    @PutMapping("/session/add")
    public Session CreateOrUpdateSession(Session session) {
        return repository.save(session);
    }

    @GetMapping("/session/{id_session}")
    public List<Session> findSessionByID(@PathVariable Integer id_session){
        return repository.findSessionByIdSession(id_session);
    }

    @DeleteMapping("/sessions/{id_session}")
    public Session deleteSessionByID(@PathVariable Integer id_session){
        return repository.deleteSessionByIdSession(id_session);
    }
}

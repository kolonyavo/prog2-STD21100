package com.final_project.controller;

import com.final_project.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.repository.RoomRepository;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    private RoomRepository repository;

    @GetMapping("/room")
    public List<Room> findRoom(){
        return repository.findAll();
    }

    @PutMapping("/room/add")
    public Room CreateOrUpdateRoom(Room room) {
        return repository.save(room);
    }

    @GetMapping("/room/{id_room}")
    public List<Room> findRoomByID(@PathVariable Integer id_room){
        return repository.findRoomByIdRoom(id_room);
    }

    @DeleteMapping("/rooms/{id_room}")
    public Room deleteRoomByID(@PathVariable Integer id_room){
        return repository.deleteRoomByIdRoom(id_room);
    }
}

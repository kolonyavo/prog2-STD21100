package com.final_project.repository;

import com.final_project.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findRoomByIdRoom(Integer idRoom);
    Room deleteRoomByIdRoom(Integer idRoom);
}

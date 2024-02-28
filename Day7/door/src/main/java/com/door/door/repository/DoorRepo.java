package com.door.door.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.door.door.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer> {

    List<Door> findByAccessType(String type);

    List<Door> findByDoorId(int doorId);

    
}
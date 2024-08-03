package com.roommanagement.room_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roommanagement.room_service.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    // Custom query methods if needed
}

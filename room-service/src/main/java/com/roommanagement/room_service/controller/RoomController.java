package com.roommanagement.room_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roommanagement.room_service.entity.Room;
import com.roommanagement.room_service.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/update")
    public String updateRoom(@RequestBody Room room) {
        // Here, you would typically save the update request in a pending state
        // For simplicity, we are directly updating the room status
        roomService.submitUpdateRequest(room);
        return "Room status update requested by maker. Awaiting checker approval.";
    }

    // Checker approves the update
    @PostMapping("/approve/{roomId}")
    public String approveUpdate(@PathVariable Long roomId) {
        Room room = roomService.getRoomById(roomId);
        if (room != null) {
            roomService.approveUpdate(room);
            return "Room status update approved by checker.";
        }
        return "Room not found.";
    }

    // Checker denies the update
    @PostMapping("/deny/{roomId}")
    public String denyUpdate(@PathVariable Long roomId) {
        Room room = roomService.getRoomById(roomId);
        if (room != null) {
            roomService.denyUpdate(room);
            return "Room status update denied by checker.";
        }
        return "Room not found.";
    }

    // Get all rooms
    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}

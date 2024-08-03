package com.roommanagement.room_service.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roommanagement.room_service.entity.Room;
import com.roommanagement.room_service.repo.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public void updateRoomStatus() {
        List<Room> rooms = roomRepository.findAll();
        for (Room room : rooms) {
            // Logic to update room status
            if (!room.isAvailable()) {
                // Update nextFreeTime based on your business logic
                room.setNextFreeTime(LocalDateTime.now().plusDays(1)); // Example logic
            }
            roomRepository.save(room);
        }
    }
    
    public void submitUpdateRequest(Room room) {
        // Here you can implement logic to save the room in a "pending" state
        // For simplicity, we will just save the room directly
        room.setAvailable(false); // Example logic: mark as not available
        room.setNextFreeTime(LocalDateTime.now().plusDays(1)); // Example logic
        roomRepository.save(room);
    }

    // Method to approve the update
    public void approveUpdate(Room room) {
        // Logic to finalize the room status update
        room.setAvailable(true); // Example: mark as available
        roomRepository.save(room);
    }

    // Method to deny the update
    public void denyUpdate(Room room) {
        // Logic to revert the changes or mark as denied
        room.setAvailable(true); // Example: revert to available
        roomRepository.save(room);
    }

    // Get a room by ID
    public Room getRoomById(Long roomId) {
        return roomRepository.findById(roomId).orElse(null);
    }

    // Get all rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}

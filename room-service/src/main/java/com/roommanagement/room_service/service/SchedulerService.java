package com.roommanagement.room_service.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    private final RoomService roomService;

    public SchedulerService(RoomService roomService) {
        this.roomService = roomService;
    }

    @Scheduled(cron = "0 0 0 * * ?") // Runs every day at 12 AM
    public void scheduleRoomStatusUpdate() {
        roomService.updateRoomStatus();
    }
}

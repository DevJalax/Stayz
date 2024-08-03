package com.roommanagement.room_service.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mayura_rooms")
public class Room {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String type; // normal or executive suite
    
    private boolean available;
    
    private LocalDateTime nextFreeTime;
    
    private int waitlistCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LocalDateTime getNextFreeTime() {
		return nextFreeTime;
	}

	public void setNextFreeTime(LocalDateTime nextFreeTime) {
		this.nextFreeTime = nextFreeTime;
	}

	public int getWaitlistCount() {
		return waitlistCount;
	}

	public void setWaitlistCount(int waitlistCount) {
		this.waitlistCount = waitlistCount;
	}

}

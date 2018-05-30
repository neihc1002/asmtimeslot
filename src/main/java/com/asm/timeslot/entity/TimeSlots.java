package com.asm.timeslot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeSlots {
    @Id
    private int id;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

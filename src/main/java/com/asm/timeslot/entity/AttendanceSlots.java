package com.asm.timeslot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AttendanceSlots {
    @Id
    private long id;
    @OneToOne
    private Class aClass;
    @OneToOne
    private TimeSlots timeSlots;
    private String subjectsId;
    private String attendanceAt;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public TimeSlots getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(TimeSlots timeSlots) {
        this.timeSlots = timeSlots;
    }

    public String getSubjectsId() {
        return subjectsId;
    }

    public void setSubjectsId(String subjectsId) {
        this.subjectsId = subjectsId;
    }

    public String getAttendanceAt() {
        return attendanceAt;
    }

    public void setAttendanceAt(String attendanceAt) {
        this.attendanceAt = attendanceAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

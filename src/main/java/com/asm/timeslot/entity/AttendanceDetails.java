package com.asm.timeslot.entity;

import javax.persistence.*;

@Entity
public class AttendanceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private AttendanceSlots attendanceSlots;
    @OneToOne
    private Student student;
    private Long attendanceTime;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AttendanceSlots getAttendanceSlots() {
        return attendanceSlots;
    }

    public void setAttendanceSlots(AttendanceSlots attendanceSlots) {
        this.attendanceSlots = attendanceSlots;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Long attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

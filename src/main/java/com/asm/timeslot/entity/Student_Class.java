package com.asm.timeslot.entity;

import javax.persistence.*;

@Entity
public class Student_Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studen_class_id;
    @OneToOne
    private Class aClass;
    @OneToOne
    private Student student;
    private String classId;
    private int status;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getClassId() {
        return classId;
    }

    private void setClassId(String classId) {
        this.classId = aClass.getId();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getStuden_class_id() {
        return studen_class_id;
    }

    public void setStuden_class_id(long studen_class_id) {
        this.studen_class_id = studen_class_id;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

}

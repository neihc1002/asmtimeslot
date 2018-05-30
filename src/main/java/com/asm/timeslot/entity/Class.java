package com.asm.timeslot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Class {
    @Id
    private String id;
    private String createAt;
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}

package com.test_08_14.team.domain;

import com.test_08_14.team.service.Status;

public class Programmer extends Employee{
    private int mumberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {}

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMumberId() {
        return mumberId;
    }

    public void setMumberId(int mumberId) {
        this.mumberId = mumberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}

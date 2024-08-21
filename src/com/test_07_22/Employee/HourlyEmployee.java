package com.test_07_22.Employee;

public class HourlyEmployee extends Employee {
    private double esge;
    private double hours;

    public HourlyEmployee() {}

    public HourlyEmployee(String name, int number, MyDate brithday, double esge, double hours) {
        super(name, number, brithday);
        this.esge = esge;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getEsge() {
        return esge;
    }

    public void setEsge(double esge) {
        this.esge = esge;
    }

    @Override
    public double earnings() {
        return esge * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}

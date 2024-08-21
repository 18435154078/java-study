package com.test_07_22.Employee;

public class SalariedEmpolyee extends Employee {
    private double monthlySalary;

    public SalariedEmpolyee() {}

    public SalariedEmpolyee(String name, int number, MyDate brithday, double monthlySalary) {
        super(name, number, brithday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmpolyee[" +  super.toString() + "]";
    }
}

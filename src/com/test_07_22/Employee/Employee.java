package com.test_07_22.Employee;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate brithday;

    public Employee() {}

    public Employee(String name, int number, MyDate brithday) {
        this.name = name;
        this.number = number;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public abstract double earnings();

    public String toString() {
        return "姓名 = " + name + ",工号 = " + number + ",生日 = " + brithday.toDateString();
    }
}

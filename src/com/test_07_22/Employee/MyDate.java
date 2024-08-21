package com.test_07_22.Employee;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {}

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }
}

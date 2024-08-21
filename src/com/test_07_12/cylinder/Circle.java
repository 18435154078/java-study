package com.test_07_12.cylinder;

public class Circle {
    private double radius;

    public Circle() {
        System.out.println("调用父类构造器");
    }

    public Circle(double radius) {
        System.out.println("调用父类构造器");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double length() {
        return 2 * Math.PI * radius;
    }
    public void say() {
        System.out.println("Circle area: " + area());
    }
}

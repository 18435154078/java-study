package com.test_07_12.cylinder;

public class CylinderTest {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder(10, 20);
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(10);
        cylinder.setHeight(20);
        System.out.println(cylinder.getVolume());

        System.out.println(cylinder.area());

    }
}

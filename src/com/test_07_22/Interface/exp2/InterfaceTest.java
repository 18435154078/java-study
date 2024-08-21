package com.test_07_22.Interface.exp2;

public class InterfaceTest {
    public static void main(String[] args) {
        // Cricle测试
        CompareCircle c1 = new CompareCircle();
        CompareCircle c2 = new CompareCircle();

        Circle c3 = new Circle();

        c1.setRadius(1.2);
        c2.setRadius(1.1);
        c3.setRadius(1.2);
        System.out.println(c1.compare(c2));
//        System.out.println(c1.compare(c3));
//        System.out.println(c1.compare("123"));

        System.out.println("===============");

        // Rectangle测试
        CompareRectangle c4 = new CompareRectangle(1,2);
        CompareRectangle c5 = new CompareRectangle(2,1);

        Rectangle c6 = new Rectangle(2,1);

        System.out.println(c4.compare(c5));
        System.out.println(c4.compare(c6));




    }
}

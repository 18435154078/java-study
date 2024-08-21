package com.test_07_23.exp1;

public class ObjectTest {
    public static void main(String[] args) {
        new Object() {
            public void test() {
                System.out.println("hello world");
            }
        }.test();
    }
}

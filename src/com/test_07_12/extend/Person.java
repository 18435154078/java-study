package com.test_07_12.extend;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello " + name);
    }
}

package com.test_07_19.abstract抽象类;

public class Student extends  Person {
    public String school;

    public Student() { }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }



    @Override
    public void eat() {
        System.out.println("学生吃");
    }


    public void sleep() {
        System.out.println("学生睡");
    }
}

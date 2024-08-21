package com.test_07_19.abstract抽象类;

//抽象类
public abstract class Person {
    public String name;
    public  int age;

    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void aaa() {
        eat();
    }

    public abstract void eat();  // 抽象方法

    public void sleep() {
        System.out.println("睡眠");
    }

}

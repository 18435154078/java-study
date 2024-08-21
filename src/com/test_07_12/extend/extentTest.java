package com.test_07_12.extend;

public class extentTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.sayHello();

        Student s1 = new Student(100);
        s1.setName("李四");
        s1.sayHello();
        s1.getScore();
        System.out.println(s1.getClass()); // 获取当前类
        System.out.println(s1.getClass().getSuperclass());  // 当前类的父类
        System.out.println(s1.getClass().getSuperclass().getSuperclass());
    }
}

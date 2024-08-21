package com.test_07_16;

import java.util.Objects;

public class equals {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 12);
        Student s2 = new Student("张三", 12);
        System.out.println(s1.equals(s2));

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(Objects.equals(s5, s6));

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) return true;
//        if(obj instanceof Person p) return name.equals(p.name) && age == p.age;
//        return false;
//    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
}
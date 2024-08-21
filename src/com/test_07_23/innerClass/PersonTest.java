package com.test_07_23.innerClass;

public class PersonTest {
    public static void main(String[] args) {
//        创建Person类的实例
        Person p1 = new Person();

//        创建 静态类 Dog的实例
        Person.Dog d = new Person.Dog("泰迪");
//        System.out.println(d.getName());
        d.show("边牧");

//        创建 Bird的实例
        Person.Bird b = p1.new Bird("黄鹂鸟");
//        System.out.println(b.getName());
        b.show("啄木鸟");
    }
}

class Person {
    String name = "Tom";
//    静态类
    static class Dog {
        private String name;

        public Dog() {
        }

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
        }
    }

    class Bird {
        private String name;

        public Bird() {
        }

        public Bird(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void show(String name) {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }
}

package com.test_07_15.Polymorphic;

import java.io.File;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest a1 = new AnimalTest();
        a1.adopt(new Dog());
        a1.adopt(new Cat());

    }
    public void adopt(Animal a) {
        a.eat();
        if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.call();
        } else if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.call();
        }
    }
}


class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
}

class Dog extends Animal {

    public void call() {
        System.out.println("汪汪汪");
    }

    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal {

    public void call() {
        System.out.println("喵喵喵");
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }
}


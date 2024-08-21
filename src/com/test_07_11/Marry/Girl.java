package com.test_07_11.Marry;

public class Girl {
    private String name;
    private int age;
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("嫁给" + boy.getName());
        boy.marry(this);
    }

}

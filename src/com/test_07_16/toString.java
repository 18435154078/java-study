package com.test_07_16;

import java.util.Arrays;

public class toString {
    public static void main(String[] args) {
        User p1 = new User("张三", 12, new String[]{"吃饭", "睡觉", "打豆豆"});
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(User.getPuc());
    }
}

class User {
    String name;
    int age;
    String [] hobby;

//    静态变量
    static String puc = "public";
    public User(String name, int age, String [] hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public static String getPuc() {
        return puc;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

}

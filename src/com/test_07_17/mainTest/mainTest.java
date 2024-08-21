package com.test_07_17.mainTest;

import java.sql.SQLOutput;

public class mainTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"11", "22", "33"};
        Main.main(arr);
        System.out.println(new Main().str);
    }
}

class Main {
    public String str;
    public static String str2;
    public static void main(String[] args) {
        System.out.println("Main 方法开始执行");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

    static {
        System.out.println("静态方法");
    }

    {
        System.out.println("非静态方法");
        str = "string1223";
        str2 = "456";
    }
}

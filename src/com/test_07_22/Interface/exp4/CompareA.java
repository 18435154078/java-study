package com.test_07_22.Interface.exp4;

public interface CompareA {
//    静态方法
    public static void method() {
        System.out.println("CompareA method");
    }
//    默认方法
    public default void method2() {
        System.out.println("CompareA method2");
    }
}

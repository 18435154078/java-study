package com.test_07_22.Interface.exp4;

public class SubClass implements CompareA{
    @Override
    public void method2() {
//        原方法
//        CompareA.super.method2();

        System.out.println("SubClass method3");
    }
}

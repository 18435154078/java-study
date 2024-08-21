package com.test_07_11.Marry;

public class marryTest {
    public static void main(String[] args) {
        Boy b = new Boy("范伟", 23);
        Girl g = new Girl("张白纸", 21);
        g.marry(b);
        b.shout();
    }
}

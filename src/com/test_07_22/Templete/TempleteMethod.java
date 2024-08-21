package com.test_07_22.Templete;

abstract class Template {
    public void spendTime() {
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
    public abstract void code();
}

public class TempleteMethod extends Template {
    @Override
    public void code() {
        for(int i = 2; i < 1000000; i++) {
            boolean flag = true;
            for(int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0)  {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(i);
        }
    }
}
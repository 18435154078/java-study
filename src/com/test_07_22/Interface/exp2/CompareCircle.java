package com.test_07_22.Interface.exp2;

public class CompareCircle extends Circle implements CompareObject{
    public CompareCircle() { }

    public CompareCircle(double radius) {
        super(radius);
    }

//    根据对象半径的大小去比较对象的大小
    @Override
    public int compare(Object o) {
        if(this == o) return 0;
        else if(o instanceof CompareCircle c) {
            if(this.getRadius() > c.getRadius()) return 1;
            else if(this.getRadius() < c.getRadius()) return -1;
            else return 0;
        }
        throw new RuntimeException("当前类型不匹配");
    }
}

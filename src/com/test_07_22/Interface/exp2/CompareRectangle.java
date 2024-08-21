package com.test_07_22.Interface.exp2;

public class CompareRectangle extends Rectangle implements CompareObject{
    public CompareRectangle() {}

    public CompareRectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public int compare(Object o) {
        if(this == o) return 0;
        else if (o instanceof CompareRectangle c) {
            if(this.getArea() > c.getArea()) return 1;
            else if(this.getArea() < c.getArea()) return -1;
            else return 0;
        }
        throw new ClassCastException();
    }
}

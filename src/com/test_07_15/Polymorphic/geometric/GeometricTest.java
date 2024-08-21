package com.test_07_15.Polymorphic.geometric;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest gTest = new GeometricTest();

        GeometricObject c1 = new Circle("red", 1, 10);
        GeometricObject r1 = new Rectangle("blue", 1, 10, 20);
        gTest.displayGeometricArea(c1);
        gTest.displayGeometricArea(r1);
        System.out.println(gTest.equalsArea(c1, r1));

    }

    /**
     * 比较两个几何体面积是否相等
     * @param g1
     * @param g2
     * @return  boolean  true：相等   false：不相等
     */
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    /**
     * 显示几何体的面积
     * @param g1
     * @return  面积
     */
    public void displayGeometricArea(GeometricObject g1) {
        System.out.println(g1.findArea());
    }
}

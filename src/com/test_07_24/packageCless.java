package com.test_07_24;

public class packageCless {
    public static void main(String[] args) {
        int number = 2;
        Integer IntObj = Integer.valueOf(number);
        System.out.println(IntObj);
        System.out.println(IntObj.intValue());

        IntObj = IntObj.intValue() + 1;
        System.out.println(IntObj);

//        自动装箱，自动拆箱
        Integer IntObj2 = number;
        System.out.println(IntObj2);
        IntObj2++;
        System.out.println(IntObj2);


//        基本数据类型int转string
        String s = String.valueOf(123);
        System.out.println(s);

//      string转boolean
        boolean aTrue = Boolean.parseBoolean("true1");
        System.out.println(aTrue);

//        string转int
        int i = Integer.parseInt("113");
        System.out.println(i);


        Integer int1 = Integer.valueOf(2);
        Integer int2 = Integer.valueOf(2);
        System.out.println(int1 == int2);  // true  -128 -- 127 相等，因为取的是常量池中提前new好的

        Integer int3 = Integer.valueOf(129);
        Integer int4 = Integer.valueOf(129);
        System.out.println(int3 == int4);  // false

        Object obj = "hello";

        String obj2 = (String) obj;
    }
}

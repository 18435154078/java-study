package com.test_07_24;

/**
 * gdk5.0之前的枚举写法
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.getSeasonName());
    }
}

class Season {
//    声明当前类的对象的实例变量
    private final String seasonName;
    private final String seasonDescription;

//    私有化构造器
    private Season(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

//    提供相应的get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

//    创建当前类的实例
    public static final Season SPRING = new Season("春天", "穿暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");
}

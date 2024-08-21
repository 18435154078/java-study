package com.test_07_24;

public class SeasonTest2 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN.toString());
        System.out.println(Season2.values()[3].toString());
        System.out.println(Season2.AUTUMN.valueOf("SUMMER"));
        System.out.println(Season2.AUTUMN.name());
        Season2.AUTUMN.show();


    }
}

interface Info {
    void show();
}
enum Season2 implements Info {
//    开头声明多个对象
    SPRING("春天", "穿暖花开") {
//        每个类中重写show方法
        @Override
        public void show() {
            System.out.println("这是一个春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("这是一个夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("这是一个秋天");
        }
    },
    WINTER("冬天", "白雪皑皑"){
        @Override
        public void show() {
            System.out.println("这是一个冬天");
        }
    };

//    实例变量
    private final String seasonName;
    private final String seasonDescription;

//    私有化构造器
    Season2(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

//    get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDescription='" + seasonDescription + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("show");
//    }
}

enum Season3 {
    SPRING,SUMMER,AUTUMN,WINTER
}
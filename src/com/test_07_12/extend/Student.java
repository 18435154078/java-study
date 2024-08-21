package com.test_07_12.extend;

public class Student extends Person {
    private int score;
    public Student(int score) {
        super();
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void getScore() {
        System.out.println("考了" + score + "分");
    }
}

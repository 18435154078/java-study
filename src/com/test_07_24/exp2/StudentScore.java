package com.test_07_24.exp2;

import com.test_07_22.Interface.exp3.Vehicle;

import java.util.Scanner;
import java.util.Vector;

public class StudentScore {
    public static void main(String[] args) {
        int len;
        int max = 0;
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        len = sc.nextInt();
        if(len <= 0) sc.close();
        for(int i = 0; i < len; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            int score = sc.nextInt();
            if(score > max) max = score;
            v.addElement(score);    // 自动装箱
//            v.addElement(Integer.valueOf(score));
        }
        sc.close();
        for(int i = 0; i < v.size(); i++) {
            Integer obj = (Integer) v.elementAt(i);
//            int cha = max - obj.intValue();
            int cha = max - obj;   // 自动装箱
            if(cha <= 10) System.out.println("A等");
            else if(cha <= 20) System.out.println("B等");
            else if(cha <= 30) System.out.println("C等");
            else  System.out.println("D等");
        }
    }
}

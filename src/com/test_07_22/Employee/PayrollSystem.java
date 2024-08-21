package com.test_07_22.Employee;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmpolyee("张三", 12345, new MyDate(1992, 4,5), 1000);
        employees[1] = new HourlyEmployee("李四", 67890, new MyDate(2001, 9,5), 40, 240);

        int mouth;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入当前的月份：");
        mouth = input.nextInt();
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println(employees[i].earnings());
            if(mouth == employees[i].getBrithday().getMonth()) {
                System.out.println("生快，加薪100！");
            }
        }
        input.close();
    }
}

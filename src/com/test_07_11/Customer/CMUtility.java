package com.test_07_11.Customer;

import java.util.Scanner;

public class CMUtility {
    private static Scanner scan = new Scanner(System.in);

    public int init() {
        System.out.println("--------------------拼电商客户管理系统--------------------");
        System.out.println("                       1 添加客户                       ");
        System.out.println("                       2 修改客户                       ");
        System.out.println("                       3 删除客户                       ");
        System.out.println("                       4 客户列表                       ");
        System.out.println("                       5 退   出                       ");
        System.out.print("                      请选择（1-5）：");
        return scan.nextInt();
    }

    /**
     * 添加用户
     * @return
     */
    public Customer addSc() {
        System.out.print("姓名：");
        String name = scan.next();
        System.out.print("性别：");
        char gender = scan.next().charAt(0);
        System.out.print("年龄：");
        int age = scan.nextInt();
        System.out.print("手机号：");
        String phone = scan.next();
        System.out.print("邮箱：");
        String email = scan.next();
        return new Customer(name, gender, age, phone, email);
    }

    /**
     * 修改用户
     * @param Customer
     */
    public Customer updateSc(Customer oldCustomer) {
        System.out.print("姓名：（" + oldCustomer.getName() + "）");
        String name = scan.next();
        System.out.print("性别：（" + oldCustomer.getGender() + "）");
        char gender = scan.next().charAt(0);
        System.out.print("年龄：（" + oldCustomer.getAge() + "）");
        int age = scan.nextInt();
        System.out.print("手机号：（" + oldCustomer.getPhone() + "）");
        String phone = scan.next();
        System.out.print("邮箱：（" + oldCustomer.getEmail() + "）");
        String email = scan.next();
        return new Customer(name, gender, age, phone, email);
    }

    /**
     * 删除用户
     */
    public int removeSc(int size) {
        System.out.print("请输入序号：");
        int index = scan.nextInt();
        if(index <= 0 || index > size) {
            System.out.println("没有找到指定客户，请重新输入！");
            return removeSc(size);
        } else {
            return index;
        }
    }

    /**
     * 关闭scan
     */
    public boolean closeScan() {
        System.out.print("是否确认退出（Y/N）：");
        char confirm = scan.next().charAt(0);
        if(confirm == 'Y' || confirm == 'y') {
            scan.close();
            return true;
        }
        return false;
    }
}

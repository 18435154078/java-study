package com.test_07_26;

import java.util.Scanner;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();

            int[] numbers = new int[10];
            System.out.println(numbers[9]);
            System.out.println(1234);

            String str = "123";
            System.out.println(str.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
//        catch (InputMismatchException e) {
//            System.out.println("输入有误");
//        } catch (NullPointerException n) {
//            System.out.println("空指针异常");
//        } catch (ArrayIndexOutOfBoundsException a) {
//            System.out.println("下标越界");
//        }
        System.out.println(5678);
    }
}

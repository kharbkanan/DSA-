package javaBasic;

import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        double a = sc.nextDouble();

        System.out.println("enter Second number:");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("a is largest" + a);
        } else {
            System.out.println("b is largest:" + b);
        }
        sc.close();
    }
}

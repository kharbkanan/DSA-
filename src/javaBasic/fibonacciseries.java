package javaBasic;

import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println("fibonacci series:");
        for (int i = 1; i <=n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
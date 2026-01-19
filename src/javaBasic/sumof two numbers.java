package javaBasic;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some input:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result= a+b;
        System.out.println("your sum is:"+ result);
    }
}
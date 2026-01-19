package javaBasic;

import java.util.Scanner;
public class message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = sc.nextLine();
        System.out.println("hello  " + name  + "  welcome");

        sc.close();
    }
}


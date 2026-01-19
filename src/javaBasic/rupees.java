package javaBasic;

import java.util.Scanner;
public class rupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        double rupees = sc.nextDouble();

        double usd = rupees / 83;
        System.out.println("in usd:" + usd);

        sc.close();
    }
}

package javaBasic;

import java.util.Scanner;
public class simpleinterest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal:");
        double p=sc.nextDouble();

        System.out.println("enter rate:");
        double r=sc.nextDouble();

        System.out.println("enter time:");
        double t=sc.nextDouble();

        double SI=(p*r*t)/100;
        System.out.println(SI);

        sc.close();
    }
}

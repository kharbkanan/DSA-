package javaBasic;

import java.util.Scanner;

public class Temperature {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter some temp in celsius:");
        float tempc = sc.nextFloat();
        float tempf= (tempc * 9/5)+32;
        System.out.println(tempf);

    }
}

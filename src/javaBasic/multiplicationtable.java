package javaBasic;

import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[]args){
        System.out.println("enter number whose table you want:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=10;i++){
            int result =a*i;
            System.out.println(result);
        }
        sc.close();
    }
}

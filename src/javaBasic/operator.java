package javaBasic;

import java.util.Scanner;
public class operator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        double a=sc.nextDouble();

        System.out.println("enter Second number:");
        double b=sc.nextDouble();

        System.out.println("Enter javaBasic.operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        if(op=='+'){
            System.out.println("sum is:"+(a+b));
        } else if (op=='-') {
            System.out.println("difference is"+(a-b));
        } else if (op=='*') {
            System.out.println("multiply is:"+(a*b));
        } else if (op=='/') {
            if(b!=0){
                System.out.println("division is:"+(a/b));
            }
            else{
                System.out.println("divison by zero is not alowed");
            }
        }
        else{
            System.out.println("invalid javaBasic.operator");
        }
        sc.close();
    }
}

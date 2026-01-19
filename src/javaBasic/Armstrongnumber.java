package javaBasic;

import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter Second number:");
        int b = sc.nextInt();

        System.out.println("Armstrong number are:");

        for(int i=a;i<=b;i++){
            int original=i;
            double sum=0;
            int temp=i;

            int digits=0;
            while(temp!=0){
                digits++;
                temp/=10;
             }
            temp=i;

            while(temp!=0){
                int digit=temp%10;
                sum= sum+Math.pow(digit,digits);
                temp/=10;
            }
            if(sum==original){
                System.out.print(original +" ");
            }
        }
        sc.close();
    }
}

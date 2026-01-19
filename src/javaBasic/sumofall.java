package javaBasic;

import java.util.Scanner;
public class sumofall {
    public static void main(String[]args){
        System.out.println("enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            if(sc.hasNextInt()){
                int n= sc.nextInt();
                sum=sum+n;
            }
            else {
                char a=sc.next().charAt(0);
                if(a=='x'||a=='X'){
                    break;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

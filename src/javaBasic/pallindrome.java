package javaBasic;

import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String n = sc.nextLine();
        int left = 0;
        int right = n.length() - 1;

        boolean flag=true;
        while(left<right) {
            if (n.charAt(left) != n.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("string is javaBasic.pallindrome");
        }
        else{
            System.out.println("string is not javaBasic.pallindrome");
        }

      sc.close();
    }
}
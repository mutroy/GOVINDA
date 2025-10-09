package Sheryians_Module1;

import java.util.Scanner;

public class Chapter8_Control_Flow_Even_or_Odd {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number : ");
//        int a = sc.nextInt();
//
//        if (a % 2 == 0) {
//            System.out.println(a + " is an even number");
//        } else {
//            System.out.println(a + " is an odd number");
//        }

        Scanner sc = new Scanner(System.in);
        /* write your code here */

        String gender = sc.nextLine();

        if(gender.equals("M") || gender.equals("m")){
            System.out.println("Hello, Sir");
        } else if(gender.equals("F")|| gender.equals("f")){
            System.out.println("Hello, Ma'am");
        }

    }
}

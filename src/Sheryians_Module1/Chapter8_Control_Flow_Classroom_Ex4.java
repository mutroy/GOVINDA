package Sheryians_Module1;

import java.util.Scanner;

public class Chapter8_Control_Flow_Classroom_Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if( year%100 == 0){
            // century
            if(year % 400 == 0){
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            // not century
            if(year % 4 == 0){
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

        }
    }
}

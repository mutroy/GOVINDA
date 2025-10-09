package Sheryians_Module1;

import java.util.Scanner;

public class Chapter8_Control_Flow_Classroom_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 & 7 :");
        int num = sc.nextInt();

        if(num>0 && num <8) {
            if(num==1){
                System.out.println("Monday");
            } else if(num == 2){
                System.out.println("Tuesday");
            } else if(num == 3){
                System.out.println("Wednesday");
            } else if(num == 4){
                System.out.println("Thursday");
            } else if(num == 5){
                System.out.println("Friday");
            } else if(num == 6){
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Invalid input");
        }
    }
}

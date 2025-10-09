package Sheryians_Module1;

import java.util.Scanner;

public class Chapter8_Control_Flow_Classroom_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units consumed : ");

        int units = sc.nextInt();
        double u100 = 420, u200 = 1020, u400 = 2620;
        double billAmount = 0.0;

        if (units > 0 && units <= 100) {
            billAmount = units * 4.2;
        } else if (units > 100 && units <= 200) {
            billAmount = u100 + (units - 100) * 6;
        } else if (units > 200 && units <= 400) {
            billAmount = u200 + (units - 200) * 8;
        } else {
            billAmount = u400 + (units - 400) * 13;
        }

        System.out.println("Total bill = " + billAmount);

        // My trail code below
//        if(units > 400){
//            billAmount = units * 13;
//            System.out.println("Total bill amount : " + billAmount);
//            System.out.println("Explanation : " + units * 13 + " = " + billAmount );
//        }else {
//            if (units > 300) {
//
//            }

    }
}

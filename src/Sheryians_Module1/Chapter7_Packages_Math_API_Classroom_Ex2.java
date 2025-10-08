package Sheryians_Module1;

import java.util.Scanner;

public class Chapter7_Packages_Math_API_Classroom_Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount , Rate of interest and time : ");
        double principal = sc.nextDouble();
        double roi = sc.nextDouble();
        double time = sc.nextDouble();

        System.out.println("Compound Interest = " + (principal * Math.pow(1 + (roi/100),time)));
    }
}

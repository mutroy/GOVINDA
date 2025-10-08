package Sheryians_Module1;

import java.util.Scanner;

public class Chapter7_Packages_Math_API_Classroom_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of triangle : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //double a = 5,b =7,c=9;
        double s = (a+b+c)/2;

//        System.out.println(s-a);
//        System.out.println(s-b);
//        System.out.println(s-c);
//        double val = s * (s-a) * (s-b) * (s-c);
        double areaOfTriangle = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area of the triangle = " + areaOfTriangle);
    }
}

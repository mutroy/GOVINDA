package Sheryians_Module1;

import java.util.Scanner;

public class Chapter7_Packages_Math_API_Classroom_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for length of the Rectangle : ");
        double length = sc.nextDouble();

        System.out.println("Enter value for breadth of the Rectangle : ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length+breadth);

        System.out.println("Area = " + area + "\nPerimeter = " + perimeter);

    }
}

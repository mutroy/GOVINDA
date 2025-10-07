package Sheryians_Module1;

import java.util.Scanner;

public class Chapter5_Scanner_API_Next_Int {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int i = sc.nextInt();

        System.out.println(i);

        System.out.println("Enter one more number: ");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.println("Sum of the numbers is " + (i+b));
    }
}

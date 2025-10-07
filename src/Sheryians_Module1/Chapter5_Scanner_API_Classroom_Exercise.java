package Sheryians_Module1;

import java.util.Scanner;

public class Chapter5_Scanner_API_Classroom_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the name : ");
        String str = sc.nextLine();
        sc.close();



        System.out.println("Dear " + str + ", please bless me now at " + age);
    }
}

package Sheryians_Module1;

import java.util.Scanner;

public class Chapter8_Control_Flow_Classroom_Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Hello " + name + " , you are a voter");
        } else {
            System.out.println("Hello " + name + " , you will be eligible to vote in " + (18-age) + "years");
        }
    }
}

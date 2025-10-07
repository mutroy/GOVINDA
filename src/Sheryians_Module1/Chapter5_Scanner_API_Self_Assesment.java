package Sheryians_Module1;

import java.util.Scanner;

public class Chapter5_Scanner_API_Self_Assesment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String str = sc.next();

        char enteredChar = str.charAt(0);

        System.out.println("The first character is : " + enteredChar);
    }
}

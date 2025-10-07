package Sheryians_Module1;

import java.util.Scanner;

public class Chapter5_Scanner_API_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.nextLine(); // Reads whole line until newline
        System.out.println("Data = " + str);

        String str1 = sc.next(); // Reads the data until space or newline
        System.out.println("Data = " + str1);


    }
}

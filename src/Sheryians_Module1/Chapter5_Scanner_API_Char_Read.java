package Sheryians_Module1;

import java.util.Scanner;

public class Chapter5_Scanner_API_Char_Read {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");

        // Read the next token (which will be treated as a String)
        String inputString = scanner.next();

        // Get the first character of the input String
        char enteredChar = inputString.charAt(0);

        System.out.println("You entered: " + enteredChar);

        // Close the scanner to release system resources
        scanner.close();
    }
}

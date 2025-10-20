package Sheryians_Module1;

import java.util.Scanner;

public class Chapter9_Ternary_Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String type = input%2 == 0 ? "Even" : "Odd";  // Ternary Operator can be nested

        System.out.println(type);

    }
}

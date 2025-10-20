package Sheryians_Module1;

public class Chapter9_Type_Conversion_Casting {
    public static void main(String[] args) {
        byte b = 123;
        int i = 1300; // Implicit or Widening

        b = (byte) i;
        System.out.println(b); // Prints 20 like cyclic process in the byte range after the range :)
        double d = 54.98;
        int j = (int) d; // Explicit or Narrowing

        System.out.println(j);
    }
}

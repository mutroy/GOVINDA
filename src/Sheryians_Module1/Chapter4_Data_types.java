package Sheryians_Module1;

public class Chapter4_Data_types {
    public static void main(String[] args) {

        byte b = 12;
        short s = 2;
        int i;
        long li;
        float fl = 5.6f;
        double dl;
        char ch;
        boolean bl;

        // This is error over here int a = 2147483648L;

        System.out.println("Data types: ");

        char cha = 'a';
        System.out.println(cha);

        for(char in =0;in<65535;in++){
            System.out.print(in);
            if(in%100 == 0) System.out.println();
        }

    }
}

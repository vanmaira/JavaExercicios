package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {


        Byte b = 1;
        Short s = 1000;
       Integer i = 10000;
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        System.out.println("help");


    }
}

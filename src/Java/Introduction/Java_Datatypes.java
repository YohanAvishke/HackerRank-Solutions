package Java.Introduction;

import java.util.*;

class Java_Datatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -2147483648 && x <= 2147483647) {
                    if (x >= -32768 && x <= 32767) {
                        if (x >= -128 && x <= 127) {
                            System.out.println("* byte");
                        }
                        System.out.println("* short");
                    }
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}



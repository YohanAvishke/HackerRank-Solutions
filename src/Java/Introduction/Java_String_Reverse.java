package Java.Introduction;

import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder builder = new StringBuilder();
        builder.append(A);
        builder = builder.reverse();
        String reverse = builder.toString();

        if (A.equals(reverse)) System.out.println("Yes");
        else System.out.println("No");

    }
}




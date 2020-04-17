package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        sc.nextLine();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

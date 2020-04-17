package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BigInteger n = scanner.nextBigInteger();
            if (n.isProbablePrime(1)) {
                System.out.println("prime");
            }
        }
    }
}

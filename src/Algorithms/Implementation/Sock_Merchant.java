package Algorithms.Implementation;

import java.io.*;
import java.util.*;

public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;

        int sock1, sock2;
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                sock1 = ar[i];
                ar[i] = 0;

                for (int j = i + 1; j < n; j++) {
                    sock2 = ar[j];
                    if (sock1 == sock2) {
                        ar[j] = 0;
                        pairs++;
                        break;
                    }
                }
            }
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Sock_Merchant";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


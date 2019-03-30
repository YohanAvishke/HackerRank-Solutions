package Data_Structures.Arrays;

import java.io.*;
import java.util.*;

public class Arrays_DS {

    static int[] reverseArray(int[] a) {
        int[] reverseArr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            reverseArr[i] = a[a.length-1-i];
        }

        return reverseArr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Arrays_DS";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


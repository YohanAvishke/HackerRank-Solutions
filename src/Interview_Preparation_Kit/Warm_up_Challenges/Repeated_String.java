package Interview_Preparation_Kit.Warm_up_Challenges;

import java.io.*;
import java.util.*;

public class Repeated_String {

    static long repeatedString(String s, long n) {
        long repetitionCount = 0;// to count num of a in string of length n
        int charCount = s.length();// to count chars in 's'

        long aCount = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'a') aCount++;
        }

        if (charCount != 1) {

            aCount = (n / charCount) * aCount;
            for (int i = 0; i < (n % charCount); i++) {
                if (arr[i] == 'a') aCount++;
            }
            repetitionCount = aCount;

        } else {
            if (aCount != 0) repetitionCount = n;
        }

        return repetitionCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Repeated_String";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

package Interview_Preparation_Kit.String_Manipulation;

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Alternating_Characters {

    static int alternatingCharacters(String s) {
        int deleteCount = 0;

        char[] charAr = s.toCharArray();
        int currentCharIndex = 0;
        for (int i = currentCharIndex + 1; i < s.length(); i++) {
            if (charAr[currentCharIndex] == charAr[i]) {
                deleteCount++;
                currentCharIndex++;
            } else {
                currentCharIndex++;
            }
        }

        return deleteCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Alternating_Characters";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

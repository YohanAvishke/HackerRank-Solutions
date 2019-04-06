package Interview_Preparation_Kit.String_Manipulation;

import java.io.*;
import java.util.*;

public class Making_Anagrams {

    static int makeAnagram(String a, String b) {
        int removals = 0;

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        boolean[] searchedBElem = new boolean[bArr.length];//to mark bArr elements as searched or not to stop duplicate searches
        int matches = 0;
        for (int i = 0; i < aArr.length; i++) {
            for (int j = 0; j < bArr.length; j++) {
                if (aArr[i] == bArr[j] && !searchedBElem[j]) {
                    matches++;
                    searchedBElem[j] = true;
                    break;
                }
            }
        }

        removals = (aArr.length + bArr.length) - (matches * 2);

        return removals;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Making_Anagrams";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


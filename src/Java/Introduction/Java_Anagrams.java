package Java.Introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        if (Arrays.equals(aArr,bArr)) isAnagram = true;

        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
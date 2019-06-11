package Java.Introduction;

import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            count++;
            System.out.println(count+" "+sc.nextLine());
        }
    }
}

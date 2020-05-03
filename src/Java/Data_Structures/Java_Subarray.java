package Java.Data_Structures;

import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int negativeSums = 0;
            int arrayLength = sc.nextInt();
            sc.nextLine();
            String[] numbers = sc.nextLine().split(" ");

            for (int i = 0; i < arrayLength; i++) {
                int sum = Integer.parseInt(numbers[i]);
                if (sum < 0) {
                    negativeSums++;
                }
                for (int j = i + 1; j < arrayLength; j++) {
                    sum += Integer.parseInt(numbers[j]);

                    if (sum < 0) {
                        negativeSums++;
                    }
                }
            }
            System.out.println(negativeSums);
        }
    }
}

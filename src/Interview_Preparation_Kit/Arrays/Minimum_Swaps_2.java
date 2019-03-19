package Interview_Preparation_Kit.Arrays;

import java.util.*;

public class Minimum_Swaps_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) arr[i] = input.nextInt();

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}


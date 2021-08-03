package Interview_Preparation_Kit.Arrays;

import java.util.*;

public class Minimum_Swaps_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) arr[i] = input.nextInt();

        // Selection  Sorting
        //        for (int i = 0; i < n; i++) {
        //            if (arr[i] != i + 1) {
        //                int smallestIndex = i;
        //
        //                for (int j = i + 1; j < n; j++) {
        //                    if (arr[i] > arr[j]) {
        //                        smallestIndex = j;
        //                    }
        //                }
        //
        //                int tmp = arr[i];
        //                arr[i] = arr[smallestIndex];
        //                arr[smallestIndex] = tmp;
        //                count++;
        //            }
        //        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                int j = i + 1;
                while (arr[j] != i + 1) {
                    j++;
                }
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                count++;
            }
        }

        System.out.println(count);
    }
}

package Interview_Preparation_Kit.Arrays;

import java.util.*;

public class Minimum_Swaps_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int count = 0, j;
        boolean[] visitArray = new boolean[n];

        for (int i = 0; i < n; i++) arr[i] = input.nextInt();

        for (int i = 0; i < n; i++) {
            if(visitArray[i]) {
                continue;
            }
            else {
                j = i;
                while(!visitArray[j]) {
                    visitArray[j] = true;
                    count++;
                    j = arr[j]-1;
                }
                count--;
            }
        }
        
        System.out.println(count);
    }
}


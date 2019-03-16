package Algorithms.Implementation;

import java.util.Arrays;
import java.util.List;

public class Birthday_Chocolate {
    static int birthday(List<Integer> s, int n, int d, int m) {
        int[] array = s.stream().mapToInt(i -> i).toArray();
        int total = 0;
        for (int i = 0; i <= n - m; i++) {
            if (Arrays.stream(array, i, i + m).sum() == d)
                total++;
        }
        return total;
    }
}

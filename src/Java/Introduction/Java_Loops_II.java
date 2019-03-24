package Java.Introduction;

import java.util.*;

class Java_Loops_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sb.setLength(0);

            for (int j = 0; j < n; ++j) {
                // 2^0 + 2^1 + ... 2^j = 2^(j+1) - 1
                sb.append((int) (a + b * (Math.pow(2, j + 1) - 1))).append(" ");
            }

            System.out.println(sb.toString());
        }

        in.close();
    }
}


package Interview_Preparation_Kit.Warm_up_Challenges;

import java.io.*;
import java.util.*;

public class Jumping_on_the_Clouds {

    static int jumpingOnClouds(int[] c) {
        int numJumps = 0;//to get total jumps required

        int curentCloud = 0;//to get current position
        while (curentCloud < c.length-1) {
            int i = c[curentCloud + 1];//first possible jump
            int j = c[curentCloud + 2];//second possible jump

            //check which possibility is do able
            if (j == 0){
                curentCloud += 2;
            }else {
                curentCloud++;
            }
            numJumps++;
        }

        return numJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Jumping_on_the_Clouds";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


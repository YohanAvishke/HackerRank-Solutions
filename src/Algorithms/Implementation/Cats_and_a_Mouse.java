package Algorithms.Implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cats_and_a_Mouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String whosLucky = "";

        while (true){
            if (x<z) x++;
            else if (x>z) x--;

            if (y<z) y++;
            else if (y>z) y--;

            if (x == z){
                if (y == z){
                    whosLucky = "Mouse C";
                    break;
                }
                else{
                    whosLucky = "Cat A";
                    break;
                }
            }else if (y == z) {
                whosLucky = "Cat B";
                break;
            }
        }

            return whosLucky;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/IO/Cats_and_a_Mouse";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

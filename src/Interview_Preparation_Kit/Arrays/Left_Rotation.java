package Interview_Preparation_Kit.Arrays;

import java.io.*;
import java.util.Arrays;

public class Left_Rotation {
    public static void main(String[] args) throws IOException {
        String fileName = System.getProperty("user.dir") + "/Inputs/Left_Rotation_Input.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String config = bufferedReader.readLine();//first line
        String[] configArr = config.split(" ");

        int n = Integer.parseInt(configArr[0]);//change
        int d = Integer.parseInt(configArr[1]);//change

        String data = "";
        String readLine;
        while ((readLine = bufferedReader.readLine()) != null) {
            data = data.concat(readLine);
        }

        String[] dataArr = data.split(" ");
        int[] a = Arrays.stream(dataArr).mapToInt(Integer::parseInt).toArray();//change

        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(result));
    }

    //this method contains logic just copy this to use in Hacker Rank
    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int rotation = i - d;
            if (rotation < 0) {
                rotation += rotatedArr.length;
            }
            rotatedArr[rotation] = a[i];
        }

        return rotatedArr;
    }
}

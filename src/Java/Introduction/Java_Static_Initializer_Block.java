package Java.Introduction;

import java.util.Scanner;

public class Java_Static_Initializer_Block {
    private static Scanner sc = new Scanner(System.in);

    private static short H = sc.nextShort();
    private static short B = sc.nextShort();
    private static boolean flag;

    static {
        try {
            flag = checkFlag();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static boolean checkFlag() throws java.lang.Exception {
        if (H > 0 && B > 0) {
            return true;
        } else throw new java.lang.Exception("Breadth and height must be positive");
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

package Java.Data_Structures;

import java.util.Scanner;
import java.util.LinkedList;

public class Java_List {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                int value = scan.nextInt();
                list.add(value);
            }

            int Q = scan.nextInt();
            for (int i = 0; i < Q; i++) {
                String action = scan.next();
                int index = scan.nextInt();
                if (action.equals("Insert")) {
                    int value = scan.nextInt();
                    list.add(index, value);
                } else {
                    list.remove(index);
                }
            }

            list.stream().map(num -> num + " ").forEach(System.out::print);
        }
    }
}

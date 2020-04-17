package Java.Data_Structures;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.HashMap;

class Java_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();

        // for (int i = 0; i < n; i++) {
        //     phoneBook.put(sc.nextLine(), sc.nextInt());
        //     sc.nextLine();
        // }

        // java 8
        IntStream.range(0, n).forEachOrdered(i -> {
            phoneBook.put(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        });

        while (sc.hasNext()) {
            String name = sc.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

package Algorithms.Implementation;

import java.util.List;

public class Bon_Appétit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }
        if ((sum/2) < b){
            System.out.println(b-(sum/2));
        }else {
            System.out.println("Bon Appetit");
        }
    }
}

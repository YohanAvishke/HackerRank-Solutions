package Algorithms.Implementation;

public class Divisible_Sum_Pairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i < j) {
                    int sum = ar[i] + ar[j];
                    boolean condi = sum % k == 0;
                    if (condi) count++;
                }
            }
        }
        return count;
    }

    /*public static void main(String[] args) {
    }*/
}

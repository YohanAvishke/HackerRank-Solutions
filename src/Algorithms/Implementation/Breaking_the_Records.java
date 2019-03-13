package Algorithms.Implementation;

public class Breaking_the_Records {
    static int[] breakingRecords(int[] scores) {
        int[] count = new int[2];
        int min = Integer.MAX_VALUE, max = -1;
        int minCount = -1, maxCount = -1;

        for (int value : scores) {
            if (value < min) {
                min = value;
                minCount++;
            }
            if (value > max) {
                max = value;
                maxCount++;
            }
        }
        count[0] = maxCount;
        count[1] = minCount;

        return count;
    }

    /*Un comment to send mock data to check the answer
    public static void main(String[] args) {
        int[] ar = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] count = breakingRecords(ar);
        System.out.println(count[0]+" "+count[1]);
        System.out.println();
    }*/
}

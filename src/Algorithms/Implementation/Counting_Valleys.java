package Algorithms.Implementation;

public class Counting_Valleys {
    static int countingValleys(int n, String s) {
        int valleyC = 0, seaLevel = 0;
        char[] steps = s.toCharArray();

        for (char step :
                steps) {
            if (step == 'U'){
                seaLevel++;
            }else {
                if (seaLevel == 0){
                    valleyC++;
                }
                seaLevel--;
            }
        }

        return valleyC;
    }
}
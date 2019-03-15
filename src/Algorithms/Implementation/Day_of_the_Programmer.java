package Algorithms.Implementation;

public class Day_of_the_Programmer {
    static String dayOfProgrammer(int year) {
        String date = "";

        if (year < 1918) {
            boolean isLeap = (year % 4) == 0;
            date = setDate(year,isLeap);
        } else if (year > 1918) {
            boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            date = setDate(year,isLeap);
        } else {
            boolean isLeap = false;
            date = "26.09."+year;
        }

        return date;
    }

    static String setDate(int year,boolean isLeap){
        if (isLeap){
            return "12.09."+year;
        }else {
            return "13.09."+year;
        }
    }
}

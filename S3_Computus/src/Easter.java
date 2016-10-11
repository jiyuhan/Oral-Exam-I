

/**
 * This is a class that inherited some methods from "Year". It basically has methods to calculate the date for Easter.
 */

import java.util.Scanner;//use the scanner to scan year input

public class Easter extends Year{
    private Year easter;
    private static int yearCount = 0;

    /*This is the method to calculate the Easter's date for any given year.
    * It uses "Meeus/Jones/Butcher" algorithm
    */
    public void getEasterDate(Easter easter) {

        int year = easter.getYear();


        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        /******************************************************
         *  I wrote the following code for testing purposes,  *
         *  to make sure the math is going right by making    *
         *  sure I get the right output every step.           *
         ******************************************************/
        /*
        System.out.format("%d%n", a);
        System.out.format("%d%n", b);
        System.out.format("%d%n", c);
        System.out.format("%d%n", d);
        System.out.format("%d%n", e);
        System.out.format("%d%n", f);
        System.out.format("%d%n", g);
        System.out.format("%d%n", h);
        System.out.format("%d%n", i);
        System.out.format("%d%n", k);
        System.out.format("%d%n", l);
        System.out.format("%d%n", m);
        */
        int month = (h + l - 7 * m + 114) / 31;
        //System.out.format("%d%n", month);
        int day = (h + l - 7 * m + 114) % 31 + 1;
        //System.out.format("%d%n", day);

        //put month and day for the Easter to the struct.
        easter.setMonthDay(month, day);
        //adding the name for any numerical month elements
        easter.monthFromNumberToName(easter.getMonth());
    }

    /* This is a method that asks user to type in a year. Then uses the getEasterDate method to achieve the goal
    *  input:
    *       The easter struct we declared in main
    *  output:
    *       the year that user typed in
    */
    public int computusEasy(Easter easter){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        easter.setYear(scanner.nextInt());
        /* This line checks user's input*/
        //System.out.format("Input year: %d%n", easter.getYear());
        easter.getEasterDate(easter);
        easter.setMonthName(easter.monthFromNumberToName(easter.getMonth()));
        System.out.format("Easter Day: %s %d, %d%n", easter.getMonthName(), easter.getDay(), easter.getYear());

        return easter.getYear();
    }
    /* computes and prints easter dates 5,700,000 times based on the year the user typed in
    *  input:
    *       year
    */

    public void computusMedium(int year){

        for(int i = 0; i < 5700001; i++) {

            Easter easter = new Easter();
            easter.setYear(year);
            year++;
            easter.getEasterDate(easter);
            easter.setMonthName(easter.monthFromNumberToName(easter.getMonth()));
            System.out.format("Easter Day: %s %d, %d%n", easter.getMonthName(), easter.getDay(), easter.getYear());
            this.yearCount++;
        }
        System.out.format("%d", this.yearCount);
    }
}

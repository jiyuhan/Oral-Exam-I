/**
 * Created by thomas on 9/29/16.
 * This is a class of necessary elements for a year. It has the year, month, day, and the name for any given year.
 */
public class Year {
    private int year;
    private int month;
    private String monthName;
    private int day;

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException(
                    "meaningless to calculate Easter before Jesus was born.");
        }
        this.year = year;
    }
    public void setMonthDay(int month, int day) {
        this.month = month;
        this.day = day;
    }
    public void setMonthName(String monthName){
        this.monthName = monthName;
    }
    public int getMonth(){
        return this.month;
    }
    public String getMonthName(){
        return this.monthName;
    }
    public int getDay(){
        return this.day;
    }
    public int getYear(){
        return this.year;
    }
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
    public String monthFromNumberToName(int month){
        String monthName;
        switch(month)
        {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "error";
        }
        return monthName;
    }
}

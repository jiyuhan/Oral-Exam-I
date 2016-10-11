/**
 * Created by thomas on 10/3/16.
 * This is the test (main) class for a program to compute the date of Easter for every given year.
 */
public class ComputusTest {
    public static void main(String[] args) {
        Easter easter = new Easter();//a new Easter
        // run the computus easy program and return the user's year input
        int year = easter.computusEasy(easter);
        System.out.print("============= Medium =============\n");//a marker before the medium part starts
        easter.computusMedium(year);//calling the medium
    }
}
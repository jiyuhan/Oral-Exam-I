/**
 * Created by thomas on 10/9/16.
 */
public class StudentTuitionTest {
    public static void main(String[] args) {

        Students studentSet = new Students();//a new student set from Students class
        studentSet.example1();//run the example 1
        System.out.println("========================YOU GOT MAIL!=========================");
        System.out.println("======Base tuition has changed to $200 / credit hour!!========");
        studentSet.example2();//run example 2 after their base tuition has been changed to 200 instead of 350
    }
}

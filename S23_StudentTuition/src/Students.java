/**
 * Created by thomas on 10/9/16.
 */
public class Students extends StudentWithTuition{

    //a set of students
    public StudentWithTuition student_1;
    public StudentWithTuition student_2;
    public StudentWithTuition student_3;
    public StudentWithTuition student_4;
    public StudentWithTuition student_5;
    public StudentWithTuition student_6;
    public StudentWithTuition student_7;
    public StudentWithTuition student_8;
    public StudentWithTuition student_9;
    public StudentWithTuition student_10;
    public StudentWithTuition student_11;
    public StudentWithTuition student_12;
    public StudentWithTuition student_13;
    public StudentWithTuition student_14;
    public StudentWithTuition student_15;
    public StudentWithTuition student_16;
    public StudentWithTuition student_17;
    public StudentWithTuition student_18;

    //this sets all the infos to 18 students to test out all the possible cases
    public void setInfos() {
        StudentWithTuition student = new StudentWithTuition();
        this.student_1 = student.quickSet("Garcia", "Thomas", "IA", "und", "CLAS", 15);
        this.student_2 = student.quickSet("Lopez", "Alejandro", "IA", "und", "ENGR", 14);
        this.student_3 = student.quickSet("Martinez", "Maria", "IA", "gra", "CLAS", 8);
        this.student_4 = student.quickSet("Fernandez", "Jose", "IA", "gra", "ENGR", 9);
        this.student_5 = student.quickSet("Petit", "Marie", "IA", "open", "CLAS", 3);
        this.student_6 = student.quickSet("Martin", "Lea", "IA", "open", "ENGR", 3);
        this.student_7 = student.quickSet("Bernard", "Chloe", "US", "und", "CLAS", 15);
        this.student_8 = student.quickSet("duBois", "Pierre", "US", "und", "ENGR", 8);
        this.student_9 = student.quickSet("Thomas", "Guillaume", "US", "gra", "CLAS", 7);
        this.student_10 = student.quickSet("Robert", "Baptiste", "US", "gra", "ENGR", 9);
        this.student_11 = student.quickSet("Durand", "Romain", "US", "open", "CLAS", 3);
        this.student_12 = student.quickSet("Leroy", "Clement", "US", "open", "ENGR", 3);
        this.student_13 = student.quickSet("Esposito", "Andrea", "fo", "und", "CLAS", 15);
        this.student_14 = student.quickSet("Rossi", "Marco", "fo", "und", "ENGR", 15);
        this.student_15 = student.quickSet("Colombo", "Valentina", "fo", "gra", "CLAS", 9);
        this.student_16 = student.quickSet("Ahlstrom", "Eleonora", "fo", "gra", "ENGR", 8);
        this.student_17 = student.quickSet("Pilkvist", "Irene", "fo", "open", "CLAS", 3);
        this.student_18 = student.quickSet("Kim", "Jun-un", "fo", "open", "ENGR", 3);
    }

    //this calculates and sets all the tuitions to all 18 students.
    public void findOutTuitions(){
        student_1.findOutTuition();
        student_2.findOutTuition();
        student_3.findOutTuition();
        student_4.findOutTuition();
        student_5.findOutTuition();
        student_6.findOutTuition();
        student_7.findOutTuition();
        student_8.findOutTuition();
        student_9.findOutTuition();
        student_10.findOutTuition();
        student_11.findOutTuition();
        student_12.findOutTuition();
        student_13.findOutTuition();
        student_14.findOutTuition();
        student_15.findOutTuition();
        student_16.findOutTuition();
        student_17.findOutTuition();
        student_18.findOutTuition();
    }

    //this prints all the briefs for all students
    public void getBriefs(){
        student_1.getBrief();
        student_2.getBrief();
        student_3.getBrief();
        student_4.getBrief();
        student_5.getBrief();
        student_6.getBrief();
        student_7.getBrief();
        student_8.getBrief();
        student_9.getBrief();
        student_10.getBrief();
        student_11.getBrief();
        student_12.getBrief();
        student_13.getBrief();
        student_14.getBrief();
        student_15.getBrief();
        student_16.getBrief();
        student_17.getBrief();
        student_18.getBrief();
    }
    public void example1(){
        setInfos();
        findOutTuitions();
        getBriefs();
    }
    public void example2(){
        setBaseRate(200);
        findOutTuitions();
        getBriefs();
    }
}
/**
 * Created by thomas on 10/9/16.
 */
public class StudentWithTuition extends Student{

    private float studentTuition;
    private float baseRate = (float) 350;
    private final float iaDiscout1 = (float) 0.35;
    private final float iaDiscout2 = (float) 0.10;
    private final float intlSur = (float) 0.03;

    public float getStudentTuition() {
        return studentTuition;
    }

    public void setStudentTuition(float studentTution) {
        this.studentTuition = studentTution;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
    }

    public void getBrief() {
        System.out.format("This student's name is %s, and is a(n) %s student. As a(n) %s student in %s who's taking %d credit hours, %s's tuition should be $%s\n",
                getName(), getResidency(), getStatus(), getCollege(), getSemesterHours(), getFirstName(), getStudentTuition());
    }

    public void findOutTuition() {
        setBaseTuition();
        residencyRelatedBaseRate();
        collegeRelatedFees();
        residencyRelatedTotal();
    }

    public void setBaseTuition () {
        float tuition = getBaseRate() * this.getSemesterHours();
        setStudentTuition(tuition);
    }

    public void residencyRelatedBaseRate () {
        switch(this.getResidency()){
            case "Iowa":
                setStudentTuition(getStudentTuition() * (1 - iaDiscout1));
                break;
            case "Domestic":
                setStudentTuition(getStudentTuition());
                break;
            case "foreign":
                setStudentTuition(getStudentTuition() * (1 + intlSur));
                break;
        }
    }

    public void collegeRelatedFees () {
        switch(this.getCollege()) {
            case "College of Liberal Arts and Sciences":
                if (this.getSemesterHours() > 3) {
                    setStudentTuition(getStudentTuition() + 400);
                }
                break;
            case "College of Engineering":
                if (this.getSemesterHours() > 6) {
                    setStudentTuition(getStudentTuition() + 200);
                }
                break;
        }
    }

    public void residencyRelatedTotal() {
        if (this.getResidency() == "Iowa") {
            setStudentTuition(getStudentTuition() * (1 - iaDiscout2));
        }
    }

    //it returns a mock student so a real student in another class could get all the informatino
    public StudentWithTuition quickSet(String last, String first, String res, String sta, String col, int sh){
        StudentWithTuition student = new StudentWithTuition();
        student.setFirstName(first);
        student.setLastName(last);
        student.setResidency(res);
        student.setStatus(sta);
        student.setCollege(col);
        student.setSemesterHours(sh);
        return student;
    }





}

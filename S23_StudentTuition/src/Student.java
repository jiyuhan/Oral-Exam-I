/* This is a class that remembers all the information for students, and is also the first class I wrote for this program.
    I am going to build a class that inherits this class to calculate all the information this class has.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String residency;
    private String status;
    private String college;
    private int semesterHours;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //I wrote this because I thought it would be useful to have first and last name altogether
    public String getName() {
        return firstName +" "+ lastName;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String reside) {
        //throw exceptions for unacceptable inputs
        if(reside != "IA" && reside != "US" && reside != "fo")
            throw new IllegalArgumentException(
                    "Wrong Type, only IA/US/fo is acceptable input");
        switch(reside){
            case "IA":
                this.residency = "Iowa";
                break;
            case "US":
                this.residency = "Domestic";
                break;
            case "fo":
                this.residency = "foreign";
                break;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        //remind bad inputs
        if(status != "und" && status != "gra" && status != "open")
            throw new IllegalArgumentException(
                    "Wrong Type, only IA/US/fo is acceptable input");
        switch(status){
            case "und":
                this.status = "undergraduate";
                break;
            case "gra":
                this.status = "graduate";
                break;
            case "open":
                this.status = "open enrolled";
                break;
        }
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        //remind bad inputs
        if(college != "CLAS" && college != "ENGR")
            throw new IllegalArgumentException(
                    "Wrong Type, only IA/US/fo is acceptable input");
        switch(college){
            case "CLAS":
                this.college = "College of Liberal Arts and Sciences";
                break;
            case "ENGR":
                this.college = "College of Engineering";
                break;
        }
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(int semesterHours) {
        String status = getStatus();

        //make sure the inputs are correct for students who have different status
        switch(status) {
            case "undergraduate":
                if(semesterHours > 15)
                    throw new IllegalArgumentException(
                        "registration has to be under 15 s.h. for undergrads");
                break;
            case "graduate":
                if(semesterHours > 9)
                    throw new IllegalArgumentException(
                            "registration has to be under 9 s.h. for graduates");
                break;
            case "open enrolled":
                if(semesterHours > 3)
                    throw new IllegalArgumentException(
                            "registration has to be under 3 s.h. if open enrolled");
                break;
        }
        this.semesterHours = semesterHours;

    }
}

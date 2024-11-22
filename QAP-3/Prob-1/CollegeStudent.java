// CollegeStudent.java, a class for holding college student data
// By: Cameron Beanland
// Date: Nov. 16th, 2024

public class CollegeStudent extends Student {
    // private objects
    private String major; // current major field of study
    private int year; // how many years in college, for example: 1, 2, 3...

    // =============================================================================    

    // constructors
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // =============================================================================    

    // getters/setters
    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    // =============================================================================    

    // toString
    @Override
    public String toString() {
        // convers year to string, representing Freshman, Sophomore, etc. with whack names
        String yearString = switch (year) {
            case 1 -> "FROSH";
            case 2 -> "SOPH";
            case 3 -> "JOON";
            case 4 -> "SEENI";
            default -> "idk";
        };
    
        // this is used to return combined string with the superclass toString
        return super.toString() + ", Majors in: " + major + ", Current year: " + yearString;
    }
}

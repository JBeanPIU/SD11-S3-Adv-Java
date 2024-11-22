// Student.java, a class including student related info (similarly small class)
// By: Cameron Beanland
// Date: Nov. 16th, 2024

public class Student extends Person {
    // protected objects
    protected String myIdNum; // student id num
    protected double myGPA; // grade point avg

    // =============================================================================

    // constructors
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // =============================================================================    

    // getters and setters
    public String getIdNum() {return myIdNum;}
    public void setIdNum(String idNum) {myIdNum = idNum;}

    public double getGPA() {return myGPA;}
    public void setGPA(double gpa) {myGPA = gpa;}

    // =============================================================================    

    // toString
    @Override
    public String toString() {
        return super.toString() + ", student ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
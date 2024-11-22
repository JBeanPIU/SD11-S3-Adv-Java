// Teacher.java, little class including the basics for teacher info, uses Person as a base for name, age, & gender
// By: Cameron Beanland
// Date: Nov. 16th, 2024

public class Teacher extends Person {
    // private objects
    private String subject; // class subject 
    private double salary;

    // =============================================================================    

    // constructors 
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // =============================================================================
    
    // getters/setters
    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    // you know what this does
    @Override
    public String toString() {
        return super.toString() + ", subject taught: " + subject + ", salary: $" + salary;
    }  
}
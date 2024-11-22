// Demo.java, used to demonstrate problem 1 classes
// By: Cameron Beanland
// Date: Nov. 16th, 2024

// to properly run, make sure you enter in the directory for where this file exists in the terminal. for example, cd "S3/Java/QAP-3/Prob-1"
// once there, now you just want to type "java Demo" and it should work! not completely sure why it wouldn't work regularly but this seems to help

public class Demo {
    public static void main(String[] args) {
        // creates & displays all given instances for Person, Student, Teacher, and CollegeStudent
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);  // this should call from each classes toString methods

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);  

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava); 

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);  
    }
}
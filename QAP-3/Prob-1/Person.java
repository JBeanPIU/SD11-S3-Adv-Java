// Person.java, a small class with only three main objects. Used for the base class for everything else in problem 1
// By: Cameron Beanland
// Date: Nov. 16th, 2024

public class Person {
    // protected objects
    protected String myName; // stores name of person
    protected int myAge; // stores age
    protected String myGender; // identifies person

    // =============================================================================    

    // constructors (just taking everything above and initializing for object creation)
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // =============================================================================

    // getters AND setters (keeping both contained together to reduce code space)
    public String getName() {return myName;}
    public void setName(String name) {myName = name;} // name

    public int getAge() {return myAge;}
    public void setAge(int age) {myAge = age;} // age

    public String getGender() {return myGender;}
    public void setGender(String gender) {myGender = gender;} // gender

    // =============================================================================

    // classic toString
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
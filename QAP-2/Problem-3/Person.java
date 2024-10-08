// Program: Person.java, a class to store a person's first name, last name, and address information
// By: Cameron Beanland
// Date: Oct. 8th, 2024

public class Person {
    private String lastName;
    private String firstName;
    private Address home; // Draws from Address.java including street name, city, state & zip

    // Constructor accepting all private info above
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    /* ----- GETTERS ----- */
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() { 
        return home; 
    }

    /* ----- SETTERS ----- */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Change the type to Address
    public void setHome(Address home) {
        this.home = home;
    }

    // Classic return string method
    @Override
    public String toString() {
        return String.format("Name: %s %s, Address: %s", firstName, lastName, home);
    }
}
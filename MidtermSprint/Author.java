// Program: Author.java, a class containing methods for managing and containing author info, such as the name, date of birth, and items.
// By: Cameron Beanland
// Date: October 31st, 2024

import java.util.*;

public class Author {
    // properties
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private List<String> items; // a list of items

    // constructors
    public Author(String firstName, String lastName, Date dateOfBirth, List<String> items) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.items = items;
    }

    /* -- GETTERS -- */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getItems() {
        return items;
    }

    /* -- SETTERS -- */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    /* -- METHODS -- */
    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public String authorName() { // added method for Library.java, just for better formatting
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Author Name: " + firstName + " " + lastName +
               "\nDate of Birth: " + dateOfBirth +
               "\nWritten works: " + items;
    }
}


// Program: Patron.java, a class representing customer (patron) information such as name, address, phone number, & list of items returned/borrowed.
// By: Cameron Beanland
// Date: October 25th, 2024

// implemented a lot of properties/getters & setters, still need to add whether it is a student or employee, plus a library item function 
// still not fully complete though either, since mmethods section is currently empty lol

import java.util.*; // adds all classes in the java.util package

public class Patron {
    // properties for patron information
    private String firstName;
    private String lastName;
    private String streetAdd;
    private Integer phoneNum;
    private List<String> borrowedItems;

    // constructors 
    public Patron (String firstName, String lastName, String streetAdd, Integer phoneNum, List<String> borrowedItems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAdd = streetAdd;
        this.phoneNum = phoneNum;
        this.borrowedItems = borrowedItems;
    }


    /* -- GETTERS -- */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAdd() {
        return streetAdd;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public List<String> getBorrowedItems() {
        return borrowedItems;
    }


    /* -- SETTERS -- */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setBorrowedItems(List<String> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }


    /* -- METHODS -- */

}

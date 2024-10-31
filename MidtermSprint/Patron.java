// Program: Patron.java, a class representing customer (patron) information such as name, address, phone number, & list of items returned/borrowed.
// By: Cameron Beanland
// Date: October 25th, 2024

import java.util.*; // adds all classes in the java.util package

public class Patron {
    // enum representing if patron is an employee or student
    public enum PatronType {
        STUDENT, EMPLOYEE
    }

    // properties for patron information
    private String firstName;
    private String lastName;
    private String streetAdd;
    private Integer phoneNum;
    private List<String> borrowedItems;
    private PatronType type; 

    // constructors 
    public Patron (String firstName, String lastName, String streetAdd, Integer phoneNum, List<String> borrowedItems, PatronType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAdd = streetAdd;
        this.phoneNum = phoneNum;
        this.borrowedItems = borrowedItems;
        this.type = type;
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

    public PatronType getType() {
        return type;
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

    public void setType(PatronType type) {
        this.type = type;
    }


    /* -- METHODS -- */
    public void borrowItem(String item) {
        borrowedItems.add(item);    // function to borrow item
    }

    public void returnItem(String item) {
        borrowedItems.remove(item); // function to remove item
    }

    public List<String> displayBorrowedItems() {
        return borrowedItems;   // function displaying borrowed items
    }

    public boolean checkBorrowedItem(String item) {
        return borrowedItems.contains(item);    // function that checks if item is borrowed
    }

    public String viewInfo() {
        return "Name: " + firstName + " " + lastName + // function to view patron information
        "\nAddress: " + streetAdd +
        "\nPhone Number: " + phoneNum +
        "\nPatron Type: " + type +
        "\nBorrowed Items: " + borrowedItems;
    }   
}

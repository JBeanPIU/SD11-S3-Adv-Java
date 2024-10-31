// Program: Author.java, a class containing methods for managing and containing author info, such as the name, date of birth, and items.
// By: Cameron Beanland
// Date: October 25th, 2024

// most implementations should be added, but any extra commits may still happen lol

import java.util.*; // adds all classes in the java.util package

public class Author {
    // properties
    private String name;
    private Date dateOfBirth;
    private List<String> items; // a list of items

    // constructors
    public Author(String name, Date dateOfBirth, List<String> items) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.items = items;
    }


    /* -- GETTERS -- */
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getItems() {
        return items;
    }


    /* -- SETTERS -- */
    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        return "Author Name: " + name + " Date: " + dateOfBirth + " Written works: " + items;
    }
}

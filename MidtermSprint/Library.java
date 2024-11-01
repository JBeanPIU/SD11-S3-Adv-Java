// Program: Libary.java, a class managing library items, authors, and patrons (alongside methods to search for library items)
// By: Cameron Beanland
// Date: October 31st, 2024

import java.util.*;

public class Library {
    // collection storing the library items, authors, & patrons
    private List<LibraryItem> libraryItems = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Patron> patrons = new ArrayList<>();


    /* -- ADDING METHODS -- */
    public void addLibraryItem(LibraryItem item) { // add new items
        libraryItems.add(item);
    }

    public void addAuthor(Author author) { // add new author
        authors.add(author);
    }

    public void addPatron(Patron patron) { // add new patron
        patrons.add(patron);
    }

    /* -- SEARCH METHODS -- */
    public LibraryItem searchTitle(String title) { // can search for title 
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null; // only if there's no match
    }

    public LibraryItem searchISBN(String ISBN) { // search by ISBN
        for (LibraryItem item : libraryItems) {
            if (item.getISBN().equals(ISBN)) {
                return item;
            }
        }
        return null;
    }

    public List<LibraryItem> searchAuthor(String authorName) { // search by author
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getAuthor().authorName().equalsIgnoreCase(authorName)) {
                results.add(item);
            }
        }
        return results;
    }

    /* -- BORROW/RETURN METHODS -- */
    public boolean borrowItem(String title, Patron patron) {
        LibraryItem item = searchTitle(title);
        if (item != null && item.isAvailable()) {
            if (item.borrowItem()) {
                patron.borrowItem(title);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String title, Patron patron) {
        if (patron.checkBorrowedItem(title)) {
            LibraryItem item = searchTitle(title);
            if (item != null) {
                item.returnItem();
                patron.returnItem(title);
                return true;
            }
        }
        return false;
    }

    public void displayLibraryItems() { // display information for all items
        for (LibraryItem item : libraryItems) {
            System.out.println(item.libraryInfo());
            System.out.println("Format: " + item.getFormat());
        }
    }

}

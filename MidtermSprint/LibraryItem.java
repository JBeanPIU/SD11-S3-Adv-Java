// Program: LibaryItem.java, used to allow editing of library items (whether to edit, add, or delete items from the library.)
// By: Cameron Beanland
// Date: October 31st, 2024


public class LibraryItem {
    // all basic props for library items
    private String id;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private Integer copyNum; // weird naming but used to identify the number of available copies


    // constructors
    public LibraryItem(String id, String title, String author, String ISBN, String publisher, Integer copyNum) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.copyNum = copyNum;
    }


    /* -- GETTERS -- */
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getCopyNum() {
        return copyNum;
    }
    

    /* -- SETTERS -- */
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyNum(Integer copyNum) { 
        this.copyNum = copyNum;
    }


    /* -- METHODS -- */
    public boolean borrowItem() { // this method is to borrow a copy of an item
        if (copyNum > 0) {
            copyNum--;
            return true; // borrowed successfully
        } else {
            System.out.println("Sorry! This item is currently checked out.");
            return false; // prints statement if there are no copies left
        }
    }

    public void returnItem() { // method to return copy of item
        copyNum++;
    }

    public String libraryInfo() { // displays all item information in this class
        return "ID: " + id +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nISBN: " + ISBN +
               "\nPublisher: " + publisher +
               "\nAvailable Copies: " + copyNum;
    }

    public boolean isAvailable() { // checks for availability
        return copyNum > 0;
    }
}

// Program: LibraryDemo.java, used to test all main points of applications to user. This is where the menu resides.
// By: Cameron Beanland
// Date: October 31st, 2024


import java.util.*;

public class LibraryDemo {
    private static List<LibraryItem> libraryItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /* -- MENU SETUP -- */
    public static void main(String[] args) {
        int choice;

        do {    // simple menu system, run the program and choose between the seven options below
            System.out.println("Welcome! You're now at the JLibrary Management System");
            System.out.println("1. Add library item");
            System.out.println("2. Edit library item");
            System.out.println("3. Delete library item");
            System.out.println("4. Borrow library item");
            System.out.println("5. Return library item");
            System.out.println("6. Display library items");
            System.out.println("7. Exit");
            System.out.print("Choose between the following (1-7): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consumes newline   
            
            switch (choice) {
                case 1:
                    addLibraryItem();
                    break;
                case 2:
                    editLibraryItem();
                    break;
                case 3:
                    deleteLibraryItem();
                    break;
                case 4:
                    borrowLibraryItem();
                    break;
                case 5:
                    returnLibraryItem();
                    break;
                case 6:
                    displayLibraryItems();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }


    /* -- METHODS FOR RUNNING APPLICATION -- */
    // CASE 1
public static void addLibraryItem() {
    System.out.println("Periodical or book? ");
    String itemType = scanner.nextLine().trim().toLowerCase();

    System.out.println("Enter ID: ");
    String id = scanner.nextLine();

    System.out.println("Enter title: ");
    String title = scanner.nextLine();

    System.out.println("Enter author's first name: ");
    String firstName = scanner.nextLine();
    System.out.println("Enter author's last name: ");
    String lastName = scanner.nextLine();

    Author author = new Author(firstName, lastName, new Date(), new ArrayList<>());

    System.out.println("Enter ISBN: ");
    String ISBN = scanner.nextLine();

    System.out.println("Enter publisher: ");
    String publisher = scanner.nextLine();

    Integer copyNum;
    Integer isAvailable;

    // handles input for total copies
    try {
        System.out.println("Enter total copies: ");
        copyNum = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter available copies: ");
        isAvailable = scanner.nextInt();
        scanner.nextLine(); 
    } catch (InputMismatchException e) {
        System.out.println("Please enter a valid number for copies.");
        scanner.nextLine(); 
        return; 
    }

    LibraryItem libraryItem;

    if (itemType.equals("book")) {
        System.out.print("Enter book format (PRINTED/ELECTRONIC/AUDIO): ");
        String formatInput = scanner.nextLine().trim().toUpperCase();
        try {
            LibraryItem.Book.Format format = LibraryItem.Book.Format.valueOf(formatInput);
            libraryItem = new LibraryItem.Book(id, title, author, ISBN, publisher, copyNum, isAvailable, format);
            libraryItems.add(libraryItem);
            System.out.println("Library item added successfully: " + libraryItem);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid book format. Please enter PRINTED, ELECTRONIC, or AUDIO.");
        }
    } else if (itemType.equals("periodical")) {
        System.out.print("Enter periodical format (PRINTED/ELECTRONIC): ");
        String formatInput = scanner.nextLine().trim().toUpperCase();
        try {
            LibraryItem.Periodical.Format format = LibraryItem.Periodical.Format.valueOf(formatInput);
            libraryItem = new LibraryItem.Periodical(id, title, author, ISBN, publisher, copyNum, isAvailable, format);
            libraryItems.add(libraryItem);
            System.out.println("Library item added successfully: " + libraryItem);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid periodical format. Please enter PRINTED or ELECTRONIC.");
        }
    } else {
        System.out.println("Invalid. Please enter 'book' or 'periodical'.");
        }
    }

        
    // CASE 2
    private static void editLibraryItem() {
        System.out.print("Enter ID of library item to edit: ");
        String id = scanner.nextLine();
            
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                System.out.print("Enter new title (or leave blank to keep current): ");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) item.setTitle(newTitle);
                    
                System.out.print("Enter new ISBN (leave blank to keep current): ");
                String newISBN = scanner.nextLine();
                if (!newISBN.isEmpty()) item.setISBN(newISBN);
                    
                System.out.println("Library item updated.");
                return;
            }
        }
        System.out.println("Error! Library item not found.");
    }


    // CASE 3
    private static void deleteLibraryItem() {
        System.out.print("Enter ID of library item to delete: ");
        String id = scanner.nextLine();
        
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                libraryItems.remove(item);
                System.out.println("Library item deleted.");
                return;
            }
        }
        System.out.println("Error! Library item not found.");
    }   


    // CASE 4
    private static void borrowLibraryItem() {
        System.out.print("Enter ID of library item to borrow: ");
        String id = scanner.nextLine();
        
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                if (item.borrowItem()) {
                    System.out.println("Successfully borrowed item: " + item.getTitle());
                }
                return;
            }
        }
        System.out.println("Error! Library item not found.");
    }   


    // CASE 5
    private static void returnLibraryItem() {
        System.out.print("Enter ID of library item to return: ");
        String id = scanner.nextLine();
        
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                item.returnItem();
                System.out.println("Successfully returned item: " + item.getTitle());
                return;
            }
        }
        System.out.println("Error! Library item not found.");
    }

    // CASE 6 
    private static void displayLibraryItems() {
        System.out.println("Library Items:");
        for (LibraryItem item : libraryItems) {
            System.out.println(item.libraryInfo());
            System.out.println("----------------------------");
        }
    }
}

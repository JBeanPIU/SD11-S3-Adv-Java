// Program: LibraryDemo.java, used to test all main points of applications to user. This is where the menu resides.
// By: Cameron Beanland
// Date: October 31st, 2024


import java.util.*;

public class LibraryDemo {
        private static List<LibraryItem> libraryItems = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        private static void initializeSampleData() { // predefined authors/books/periodicals for testing purposes with the menu
            // six authors
            Author author1 = new Author("Dr.", "Seuss", new Date(), new ArrayList<>());
            Author author2 = new Author("Koyoharu", "Gotouge", new Date(), new ArrayList<>());
            Author author3 = new Author("James", "Clear", new Date(), new ArrayList<>());
            Author author4 = new Author("Scientific", "American", new Date(), new ArrayList<>());
            Author author5 = new Author("National", "Geographic Society", new Date(), new ArrayList<>());
            Author author6 = new Author("Massachusetts", "Medical Society", new Date(), new ArrayList<>());
        
            // three books
            libraryItems.add(new LibraryItem.Book(
                "1", "Green Eggs & Ham", author1,
                "978-0134686097", "Random House", 5, 5, LibraryItem.Book.Format.ELECTRONIC
            ));
            
            libraryItems.add(new LibraryItem.Book(
                "2", "Demon Slayer", author2,
                "952-0134827164", "Shueisha", 6, 6, LibraryItem.Book.Format.PRINTED
            ));
        
            libraryItems.add(new LibraryItem.Book(
                "3", "Atomic Habits", author3,
                "980-0132039487", "Avery", 4, 4, LibraryItem.Book.Format.AUDIO
            ));
        
            // three periodicals
            libraryItems.add(new LibraryItem.Periodical(
                "4", "Scientific American", author4,
                "0036-8733", "Springer Nature", 10, 10, LibraryItem.Periodical.Format.PRINTED
            ));
            
            libraryItems.add(new LibraryItem.Periodical(
                "5", "National Geographic", author5,
                "0027-9358", "National Geographic Partners", 5, 5, LibraryItem.Periodical.Format.PRINTED
            ));
        
            libraryItems.add(new LibraryItem.Periodical(
                "6", "The New England Journal of Medicine", author6,
                "0028-4793", "Massachusetts Medical Society", 8, 8, LibraryItem.Periodical.Format.ELECTRONIC
            ));
        }
        

    /* -- MENU SETUP -- */
    public static void main(String[] args) {
        initializeSampleData();
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
                // Prompt for new title
                System.out.print("Enter new title (or leave blank to keep current): ");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) item.setTitle(newTitle);

                // Prompt for new author
                System.out.print("Enter new author first name (or leave blank to keep current): ");
                String newAuthorFirstName = scanner.nextLine();
                System.out.print("Enter new author last name (or leave blank to keep current): ");
                String newAuthorLastName = scanner.nextLine();
                if (!newAuthorFirstName.isEmpty() || !newAuthorLastName.isEmpty()) {
                    Author currentAuthor = item.getAuthor(); // Assuming getAuthor() is defined
                    String firstName = !newAuthorFirstName.isEmpty() ? newAuthorFirstName : currentAuthor.getFirstName();
                    String lastName = !newAuthorLastName.isEmpty() ? newAuthorLastName : currentAuthor.getLastName();
                    item.setAuthor(new Author(firstName, lastName, new Date(), new ArrayList<>())); // Adjust as needed
                }

                // Prompt for new ISBN
                System.out.print("Enter new ISBN (or leave blank to keep current): ");
                String newISBN = scanner.nextLine();
                if (!newISBN.isEmpty()) item.setISBN(newISBN);

                // Prompt for new publisher
                System.out.print("Enter new publisher (or leave blank to keep current): ");
                String newPublisher = scanner.nextLine();
                if (!newPublisher.isEmpty()) item.setPublisher(newPublisher);

                // Prompt for new total copies (copyNum)
                System.out.print("Enter new total copies (or leave blank to keep current): ");
                String newTotalCopiesStr = scanner.nextLine();
                if (!newTotalCopiesStr.isEmpty()) {
                    try {
                        int newTotalCopies = Integer.parseInt(newTotalCopiesStr);
                        item.setCopyNum(newTotalCopies); // Ensure setCopyNum() is defined in LibraryItem
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid total copies. Keeping current value.");
                    }
                }

                // Prompt for new format (only for books)
                if (item instanceof LibraryItem.Book) {
                    System.out.print("Enter new format (ELECTRONIC/PRINTED/AUDIO) (or leave blank to keep current): ");
                    String newFormatStr = scanner.nextLine();
                    if (!newFormatStr.isEmpty()) {
                        try {
                            LibraryItem.Book.Format newFormat = LibraryItem.Book.Format.valueOf(newFormatStr.toUpperCase());
                            ((LibraryItem.Book) item).setFormat(newFormat); // Ensure setFormat() exists in LibraryItem.Book
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid format entered. Keeping current format.");
                        }
                    }
                }

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

            // an iterator used to safely remove items from the list
            Iterator<LibraryItem> iterator = libraryItems.iterator();
            while (iterator.hasNext()) {
            LibraryItem item = iterator.next();
            if (item.getId().equals(id)) {
                iterator.remove(); // removes item
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
                // Calls borrowItem method, reduces copyNum
                if (item.borrowItem()) {
                    System.out.println("Successfully borrowed item: " + item.getTitle());
                } else {
                    System.out.println("Error! No copies available for borrowing.");
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

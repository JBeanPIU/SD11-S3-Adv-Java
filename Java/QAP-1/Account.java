// Program: Account.java, used to obtain information on a clients id, name, and balance number
// By: Cameron Beanland
// Date: Sept. 24th, 2024

/* ----- ACCOUNT INFORMATION FOR CLIENT ----- */
// A public class for the account, to store the id, name, and balance of an individual
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructor with all 3 parameters (id, name, balance)
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor with only the ID and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }


    /* -- getters used to have access to variables directly -- */
    // Obtain ID
    public String getID() {
        return id; 
    }

    // Obtain name
    public String getName() {
        return name; 
    }

    // Obtain balance
    public int getBalance() {
        return balance;
    }

    /* ----- METHODS & PRINT STATEMENTS ----- */
    // Method for adding credit to balance
    public int credit(int amt) {
        balance += amt; // Add amount to the balance
        return balance; // Return updated balance
    }

    // Method for debiting an amount from the balance
    public int debit(int amt) {
        if (amt <= balance) { 
            balance -= amt;
        } else {
            System.out.println("The amount exceeds balance!");
        }
        return balance; // Return updated balance
    }

    // Method to transfer amount to a different account
    public int transferAmt(Account another, int amt) {
        if (amt <= balance) { 
            this.debit(amt); 
            another.credit(amt); 
        } else {
            System.out.println("The amount exceeds balance!");
        }
        return balance; 
    }

    /* -- Method for displaying the account details -- */
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}





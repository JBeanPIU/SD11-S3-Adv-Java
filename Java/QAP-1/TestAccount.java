// Program: TestAccount.java, main purpose is to test the functions of Account.java and see if everything works properly
// By: Cameron Beanland
// Date: Sept. 24th, 2024

/* ----- TESTING ACCOUNT.JAVA TO VERIFY IF METHODS ARE WORKING CORRECTLY ----- */
public class TestAccount {
    public static void main(String[] args) {
        // The two accounts are created here
        Account firstAcc = new Account("A101", "Cameron", 5000);
        Account secondAcc = new Account("A102", "Maxine", 4000);

        // Displaying initial balance 
        System.out.println("Current balance of the first account: " + firstAcc.getBalance());
        System.out.println("Current balance of the second account: " + secondAcc.getBalance());

        // Transfer $1949 from the first account to the second account
        firstAcc.transferAmt(secondAcc, 1000);

        // Displaying balance after transfer
        System.out.println("New balance of the first account: " + firstAcc.getBalance());
        System.out.println("New balance of the second account: " + secondAcc.getBalance());
    }
}
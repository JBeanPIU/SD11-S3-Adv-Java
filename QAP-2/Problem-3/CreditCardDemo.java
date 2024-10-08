// Program: CreditCardDemo.java, for testing purposes of CreditCard.java
// By: Cameron Beanland
// Date: Oct. 8th, 2024


public class CreditCardDemo {
    public static void main(String[] args) {
        // Money objects for testing problem deliverables
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        // Initialization of the Person & Address objects 
        Person owner = new Person("Diane", "Christie", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        // New CreditCard object
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Owner info + initial balance/credit limit
        System.out.println(visa.getPersonals()); // prints owner info
        System.out.println("Balance: $" + visa.getBalance()); // initial balance (should be 0)
        System.out.println("Credit Limit: $" + visa.getCreditLimit()); // cred limit (should be 1000)

        // Charging different amounts to card and displaying balance
        System.out.println("Attempt to charge $" + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT); 
        System.out.println("Balance: $" + visa.getBalance()); 

        System.out.println("Attempt to charge $" + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT); // Should be successful
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to pay $" + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge $" + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT); 
        System.out.println("Balance: " + visa.getBalance()); 
    }
}
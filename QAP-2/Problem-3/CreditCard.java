// Program: CreditCard.java,
// By: Cameron Beanland
// Date: Oct. 8th, 2024

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructors for all sensitive info below
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0); 
    }

    /* ----- GETTERS ----- */
    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    // Method returning owner's name & address details from Person.java
    public String getPersonals() {
        Address address = owner.getAddress(); 
        return String.format("%s %s, %s, %s, %s, %s", 
                             owner.getFirstName(), 
                             owner.getLastName(), 
                             address.getStreet(), 
                             address.getCity(), 
                             address.getState(), 
                             address.getZip());
    }
    // Charge method to add amt to credit limit
    public void charge(Money amount) {
        if (balance.add(amount).compareAmt(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: $" + balance);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Payment method to reduce balance from credit limit
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: $" + balance);
    }
}
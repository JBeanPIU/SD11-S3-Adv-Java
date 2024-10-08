// Program: Money.java, a class utilizing 'Money' as a copy constructor to handle currency conversions,
//          Also includes method to add, subtract, compare, and check for equality (in order)
// By: Cameron Beanland
// Date: Oct. 8th, 2024

public class Money {
    private long dollars;
    private long cents;

    // Main constructor with validation
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Please do not add a negative amount, I'm begging you.");
        }
        dollars = (long) amount; // this assumes amt is converted to long for dollars
        cents = Math.round((amount - dollars) * 100); // calculates cents and rounds
    }

    // Copy constructor, to ensure fields are properly duped
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }


    /* ----- ADDITION METHOD; add two Money objects ----- */
    public Money add(Money otherAmount) {
        long totalDollars = this.dollars + otherAmount.dollars;
        long totalCents = this.cents + otherAmount.cents;

        // This method ensures that total cents doesn't exceed 100, and adjusts accordingly
        if (totalCents >= 100) {
            totalDollars += totalCents / 100;
            totalCents = totalCents % 100;
        }

        return new Money(totalDollars + totalCents / 100.0);
    }


    /* ----- SUBTRACTION METHOD; subtract one Money object from another ----- */
    public Money subtract(Money otherAmount) {
        long totalDollars = this.dollars - otherAmount.dollars;
        long totalCents = this.cents - otherAmount.cents;

        // Same logic from add method, except now trying to prevent an underflow
        if (totalCents < 0) {
            totalDollars -= 1; // this reduces dollars
            totalCents += 100; // this adjusts cents
        }

        return new Money(totalDollars + totalCents / 100.0);
    }


    /* ----- COMPARING METHOD; compares two Money objects ----- */
    public int compareAmt(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars); 
        }
        return Long.compare(this.cents, otherObject.cents);
    }


    /* ----- EQUAL CHECK; testing if two Money objects are equal ----- */
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    
    // Method to return string representation of Money object
    public String toString() {
        return String.format("%d.%02d", dollars, cents);
    }
}


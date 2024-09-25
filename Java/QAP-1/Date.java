// Program: Date.java, a program used to extract a date using toString method
// By: Cameron Beanland
// Date: Sept. 24th, 2024

/* ----- DATE SETUP ----- */
// A public class for Date, used for inputting the day, month & year
public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor designed for gives day, month & year a lowest default value
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    // Constructor to initialize day, month & year using specific ranges
    public Date(int day, int month, int year) {
        this.day = Math.max(1, Math.min(day, 31));
        this.month = Math.max(1, Math.min(month, 12));
        this.year = Math.max(1900, Math.min(year, 9999));

    }


    /* -- getters used to have access to variables directly -- */
    // Obtains date
    public int getDay() {
        return day; 
    }

    // Obtains month
    public int getMonth() {
        return month; 
    }

    // Obtains year
    public int getYear() {
        return year;
    }

    /* -- setters to modify day, month, year -- */
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // This method sets all date fields together
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /* -- Method to display date in dd/mm/yyyy format -- */
    public String toString() {
        // Days & months must be displayed with two digits, while year has four (as shown in %04d)
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}






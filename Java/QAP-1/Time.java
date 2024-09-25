// Program: Time.java, a program using time objects to display specific values
// By: Cameron Beanland
// Date: Sept. 2th, 2024

/* ----- TIME CLASS FOR TIME.JAVA ----- */
// A public class called Time, used to input hour, minutes, and seconds
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor designed for gives day, month & year a lowest default value
    public Time() {
        this(0, 0, 0);
    }
    
    // Constructor to initialize hours, minutes, and seconds by calling the setters (they contain the math for better validation)
    public Time(int hours, int minutes, int seconds) {
        setHour(hours);
        setMinute(minutes);
        setSecond(seconds);
    }


    /* -- getters used to have access to variables directly -- */
    // Obtains date
    public int getHour() {
        return hours; 
    }

    // Obtains 
    public int getMinute() {
        return minutes; 
    }

    // Obtains year
    public int getSecond() {
        return seconds;
    }


    /* -- setters to modify hour, minutes, and seconds -- */
    public void setHour(int hours) {
        this.hours = Math.max(0, Math.min(hours, 23));
    }

    public void setMinute(int minutes) {
        this.minutes = Math.max(0, Math.min(minutes, 59));

    }

    public void setSecond(int seconds) {
        this.seconds = Math.max(0, Math.min(seconds, 59));
    }

    // This method sets all date fields together
    public void setDate(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    /* ----- METHOD ARGS ----- */
    public Time nextSecond() {
        if (++seconds == 60) {
            seconds = 0;
            if (++minutes == 60) {
                minutes = 0;
                if (++hours == 24) {
                    hours = 0;
                }
            }
        }
        return this; // Returns updated time instance with a positive integer
    }

    public Time previousSecond() {
        if (--seconds < 0) {
            seconds = 59;
            if (--minutes < 0) {
                minutes = 59;
                if (--hours < 0) {
                    hours = 23;
                }
            }
        }
        return this; // Same thing as above, but decrements the integer instead
    }

    /* -- Method displaying time in the hh:mm:ss format as requested -- */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds); // Formats hours, minutes, and seconds to be displayed with two digits only (00, 01, 02, etc.)
    }
}
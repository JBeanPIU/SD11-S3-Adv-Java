// Program: Account.java, used to obtain information on a clients id, name, and balance number
// By: Cameron Beanland
// Date: Sept. 25th, 2024


public class TestTime {
    public static void main(String[] args) {
        // The two time objects are created here
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display time objects
        System.out.println("Time for t1: " + t1);
        System.out.println("Time for t2: " + t2);

        // Adding increment of t1 & decrement of t2 integers below
        t1.nextSecond();
        System.out.println("Time for t1 one second after: " + t1);

        t2.previousSecond();
        System.out.println("Time for t2 one second before: " + t2);
    }

}
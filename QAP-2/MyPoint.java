// Program: MyPoint.java, a program that creates two points using x and y coords 
// By: Cameron Beanland
// Date: Oct. 6th, 2024

/* ----- INSTANCE SETUP ----- */
// Creating instance variables for x and y coords to be used with the MyLine class
public class MyPoint {
    // private class variables, only to be used within this class
    private int x;
    private int y;

    // Constructors to help initialize the x and y coords
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    /* -- GETTERS used to have direct access to x and y coords -- */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /* -- SETTERS to modify any given coordinate */
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* -- Method returning a string of MyPoint in the (x, y) format -- */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}




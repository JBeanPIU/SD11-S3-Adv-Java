// Program: MyRectangle.java, used to represent a rectangle via two MyPoint instances
// By: Cameron Beanland
// Date: Oct. 7th, 2024

public class MyRectangle {
    // Instance variables for the top-left and bottom-right points of the rectangle
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor initializing both points
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Setting constructor parameters to (0, 0) and (1, 1) respectively
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    /* -- GETTERS used to have direct access to x and y coords -- */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /* ----- SETTERS, to modify coords ----- */ 
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    /* ----- METHODS SECTION ----- */
    // Using multiple math related methods to calculate width, height, area, & perimeter. 
    // This is to give a more accurate representation of the rectangle through the output process.

    // Method to calculate width of rectangle
    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate height
    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }
    // Method to calculate the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight(); 
    }

    // Method calculating perimeter
    public double getPerim() {
        return 2 * (getWidth() + getHeight());
    }

    // Override toString method to provide a textual representation of the rectangle
    @Override
    public String toString() {
        return "MyRectangle[Top Left: " + topLeft.toString() + ", Bottom Right: " + bottomRight.toString() + "]";
    }

    
    
}

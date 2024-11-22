// Point.java, class for creating a specific coordinate
// By: Cameron Beanland
// Date: Nov. 19th, 2024

public class Point {
    // private classes for X and Y variables
    private float x = 0.0f;
    private float y = 0.0f;

    // ========================

    // creates an object with default field values, so 0.0f for x and y
    public Point() {}

    // ========================

    // getter objects
    public float getX() {return x;}
    public float getY() {return y;}

    // ========================

    // setter objects
    public void setX(float x) {this.x = x;}
    public void setY(float y) {this.y = y;}
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // ========================

    // used for coord retrieval for x and y
    public float[] getXY() {
        return new float[] {x, y};
    }

    // ========================

    @Override
    public String toString() {
        return "(" + x + "," + y + ")"; // encapsulates it so it displays as something like (1, 4) for examples
    }
    
}
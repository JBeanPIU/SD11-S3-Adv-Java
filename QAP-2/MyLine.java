// Program: MyLine.java, a program using MyPoint instances to create a line
// By: Cameron Beanland
// Date: Oct. 6th, 2024

/* ----- LINE SETUP ----- */
public class MyLine {
    /* -- only used in this class, this just marks the beginning and end of the line -- */
    private MyPoint begin;
    private MyPoint end;

    // Classic constructor class to initialize the two points
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    /* ----- GETTERS; obtaining access to coords ----- */
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    /* ----- SETTERS, to modify coords ----- */
    public MyPoint setBegin(MyPoint begin) {
        this.begin = begin;
        return this.begin;
    }

    public MyPoint setEnd(MyPoint end) {
        this.end = end;
        return this.begin;
    }

    // Basic methods to place x and y coord values from start to end 
    // First four are getters, last four are setters
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    /* ----- METHODS for setting both coordinates to their beginning/end points ----- */
    /* -- starting point -- */
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    /* -- end point -- */
    public void setEndXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    // Method calculating the Length of the line
    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate and return the gradient (slope) of the line in radians
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
public String toString() {
    return "MyLine[" + begin.toString() + ", " + end.toString() + "]";
}

}

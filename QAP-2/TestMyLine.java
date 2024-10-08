// Program: TestMyLine.java, simply used to test the MyLine class methods
// By: Cameron Beanland
// Date: Oct. 6th, 2024

public class TestMyLine {
    public static void main (String[] args) {
        // Creates the two points for the line
        MyLine line1 = new MyLine(0, 0, 3, 4);

        // Prints the line 
        System.out.println("Initial line: " + line1);

        // Testing getters 
        System.out.println("Start: " + line1.getBegin()); // should print (0, 0)
        System.out.println("End: " + line1.getEnd()); // should print (3, 4) 

        // Testing getLength + getGradient methods
        System.out.println("Length of line: " + line1.getLength()); // length should be 5.0 (due to being 3-4-5 triangle)
        System.out.println("Gradient of the line: " + line1.getGradient());  // prints angles in radians

        // Line modification + printing modified line
        line1.setBeginXY(1, 1); // sets begin point to (1, 1)
        line1.setEndXY(4, 5); // sets end point to (4, 5)
        System.out.println("Modified line is: " + line1); // prints (1, 1) and (4, 5) respectively

        // Testing setters + verifying methods to see if they work
        line1.setBegin(new MyPoint(2, 2));  // new beginning point (2, 2)
        line1.setEnd(new MyPoint(5, 6));    // new end point (5, 6)

        System.out.println("New beginning point: " + line1.getBegin());  // should print (2, 2)
        System.out.println("New end point: " + line1.getEnd());   // should print (5, 6)

        // Testing length and gradient again after modifications
        System.out.println("New Length of the line: " + line1.getLength());
        System.out.println("New Gradient of the line: " + line1.getGradient());  
    }
}
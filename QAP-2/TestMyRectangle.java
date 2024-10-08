// Program: TestMyRectangle.java, a simple script to test system outputs for the MyRectangle class
// By: Cameron Beanland
// Date: Oct. 7th, 2024

public class TestMyRectangle {
    public static void main(String[] args) {
        // Two new points for rectangle
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(4, 2);

        // Creating the rectangle 
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Print section, just to confirm everything works
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerim());

        // This section is to modify the rectangle, just to verify that there's no issues with the code (mostly to test the math lol)
        // The original rectangle will be displayed above, and the altered one below
        rectangle.setTopLeft(new MyPoint(0, 8));
        System.out.println("New placement: " + rectangle);
        System.out.println("New Width: " + rectangle.getWidth());
        System.out.println("New Height: " + rectangle.getHeight());
        System.out.println("New Area: " + rectangle.getArea());
        System.out.println("New Perimeter: " + rectangle.getPerim());
        // By changing either value to be bigger or smaller, it'll result in differences between the area and perimeter!
        // Poke around with it and test it yourself, math should be correct and verifies that everything works properly.
    }
}

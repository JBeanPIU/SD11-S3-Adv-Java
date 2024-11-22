// Triangle.java, a class demonstrating any three point shape
// By: Cameron Beanland
// Date: Nov. 19th, 2024

public class Triangle extends Shape {
    // private objects to represent each of the three sides for the triangle
    private double side1;
    private double side2;
    private double side3;

    // ==========================================     

    // constructor
    public Triangle(double side1, double side2, double side3) {
        this.name = "Triangle";
        // this quickly checks to see if all sides create a triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid triangle sides. Exiting program.");
            System.exit(1); // using this to exit if not a valid triangle
        }
    }

    // ========================================== 

    // perim of Triangle: P = a + b + c
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // area of Triangle: 
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
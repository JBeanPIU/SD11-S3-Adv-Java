// Ellipse.java, creating an ellipse shape with coords
// By: Cameron Beanland
// Date: Nov. 20th, 2024

public class Ellipse extends Shape {
    // private objects, a & b, representing the major and minor axis respectively
    private double a;
    private double b; 

    // ========================================== 

    // constructor to initialize ellipse coords
    public Ellipse(double a, double b) {
        this.name = "Ellipse";
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    // ========================================== 

    // area of an ellipse: A = π * a * b
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // perimeter of an ellipse: P ≈ π(3(a + b) - √((3a + b)(a + 3b)))
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}
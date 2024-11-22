// Circle.java, pretty self-explanatory; creating a shape of a circle
// By: Cameron Beanland
// Date: Nov. 21st, 2024

// *carrying over from problem 3, due to it being in separate folders

public class Circle extends Shape {
    private double radius;

    // constructor
    public Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    // calculates the area of a circle (copied online because i had no idea how to type it out normally): A = π * r^2
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // perimeter (or circumference) of a circle, also pasted: P = 2 * π * r
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // extra @Override added to allow scalability factor
    public void Scale(double factor) {
        this.radius *= factor; // should end up scaling radius by factor
    }
}
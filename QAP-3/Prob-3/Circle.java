// Circle.java, small class to create the shape of a circle using calculations
// By: Cameron Beanland
// Date: Nov. 19th, 2024

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
}

// had a bunch of errors, not sure why (tried messing with deleting somethings but didnt want to mess around too much, still seems to work fine though when you run demo)
// as much as i hate the errors as well i dont want to mess with my code more LOL 
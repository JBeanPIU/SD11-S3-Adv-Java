// Shape.java, an abstract class being used as a blueprint for the other shapes in problem 3
// By: Cameron Beanland
// Date: Nov. 19th, 2024

public abstract class Shape {
    protected String name; // this is the name of the shape

    // ========================================== 

    // getter, just to obtain the name
    public String getName() {
        return name;
    }

    // ==========================================

    // abstract methods to help get the area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // ==========================================

    // toString
    @Override
    public String toString() {
        return "Shape: " + name + " | Area: " + getArea() + " | Perimeter: " + getPerimeter();
    } // with the String name and getter, alongside abstract objects, this allows the shape name, area, and perim be called from different classes without having to type each individually,
      // so no "shape of circle: " or "area of triangle: " since it does it by itself
}
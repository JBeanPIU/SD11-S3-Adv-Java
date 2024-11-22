// EquilateralTriangle.java, a class recreating a perfectly three sided triangle
// By: Cameron Beanland
// Date: Nov. 20th, 2024

public class EquilateralTriangle extends Triangle {

    // constructor for an all-even sided triangle
    public EquilateralTriangle(double side) {
        super(side, side, side); // calls parent constructor (from Triangle class) with all sides equal
        this.name = "Equilateral Triangle";
    }
}
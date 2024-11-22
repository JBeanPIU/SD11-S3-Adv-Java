// EquilateralTriangle.java, same as problem 3 lol
// By: Cameron Beanland
// Date: Nov. 21st, 2024

// *carrying over from problem 3, due to it being in separate folders

public class EquilateralTriangle extends Triangle {

    // constructor for an all-even sided triangle
    public EquilateralTriangle(double side) {
        super(side, side, side); // calls parent constructor (from Triangle class) with all sides equal
        this.name = "Equilateral Triangle";
    }

    // ==============================================

    @Override
    public void scale(double factor) {
        this.side1 *= factor;  // technically since all sides are equal, scaling any side would be enough. doing it this way to be safe though
        this.side2 *= factor;
        this.side3 *= factor;
    } // this one actually gets more than 3 lines of code now
}


// Demo.java, for testing purposes with problem 3
// By: Cameron Beanland
// Date: Nov. 19th, 2024

// to properly run, make sure you enter in the directory for where this file exists in the terminal. for example, cd "S3/Java/QAP-3/Prob-3"
// once there, now you just want to type "java Demo" and it should work. (for this one i didn't check to see if i had to add each of the classes, just did it from habit 
// of the other two) not working lol

public class Demo {
    public static void main(String[] args) {
        // creates an array of shape objects down below
        Shape[] shapes = new Shape[4];

        // instantiates each of the shapes
        shapes[0] = new Circle(5.0); 
        shapes[1] = new Ellipse(6.0, 4.0); 
        shapes[2] = new Triangle(3.0, 4.0, 5.0); 
        shapes[3] = new EquilateralTriangle(6.0);

        // loop through array and print details with toString
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
// Demo.java (again), last demo class used for testing modifications in problem 4
// By: Cameron Beanland
// Date: Nov. 21st, 2024

// *this is the only one from problem three that i couldn't just copy & paste while adding scalability factor to it, had to change it up a bit for it to work
//  still went with the whole running javac Demo.java just to be sure everything works properly (maybe its something i did), so i pray this doesn't take up
//  too much space or takes forever to download lol

public class Demo {
    public static void main(String[] args) {
        // creates an array of shape objects down below
        Shape[] shapes = new Shape[4];

        // instantiates each of the shapes
        shapes[0] = new Circle(5.0); 
        shapes[1] = new Ellipse(6.0, 4.0); 
        shapes[2] = new Triangle(3.0, 4.0, 5.0); 
        shapes[3] = new EquilateralTriangle(6.0); 

        // print details before scaling
        System.out.println("This is before scaling...:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        // scale all scalable shapes in the array
        double scaleFactor = 2.0; // example scaling factor
        scaleShapes(shapes, scaleFactor);

        // print details after scaling
        System.out.println("\nScaling in effect:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    // Static method to scale an array of Scalable objects
    public static void scaleShapes(Shape[] shapes, double scaleFactor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) { // Check if the shape implements Scalable
                ((Scalable) shape).scale(scaleFactor); // Cast and scale the shape
            }
        }
    }
}
// Demo.java, for testing purposes of problem 2
// By: Cameron Beanland
// Date: Nov. 18th, 2024


// to properly run, make sure you enter in the directory for where this file exists in the terminal. for example, cd "S3/Java/QAP-3/Prob-2"
// once there, now you just want to type "java Demo" and it should work.

public class Demo {
    public static void main(String[] args) {
        // this tests the Point class to see if everything works
        Point p = new Point();
        p.setXY(3.0f, 4.0f);
        System.out.println("Point: " + p); // the output for this SHOULD end up being (3.0, 4.0)

        // testing the MovablePoint class now
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("First point: " + mp);
        mp.move(); // this moves the point
        System.out.println("Oh god where did it go?? Oh it's at just at " + mp);
    }
}
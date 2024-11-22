// MovablePoint.java, a class that allows movement of a specific point
// By: Cameron Beanland
// Date: Nov. 18th, 2024

class MovablePoint extends Point {
    // basic object setup
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // ============================

    // sets default values for MovablePoint
    public MovablePoint() {}

    // ============================

    // constructor to initialize values
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        setXY(x, y); // taken (inherited) method from the Point.java class
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // ============================

    // setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    // ============================
    
    public MovablePoint move() {
        setX(getX() + xSpeed); // these two use inherited methods from Point.java, specifically the getX/Y, and setX/Y
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
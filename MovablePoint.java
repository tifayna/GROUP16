class MovablePoint extends Point {
    private double xSpeed;
    private double ySpeed;
//creating constructors
    public MovablePoint() {
        super();
        this.xSpeed = 0.0;
        this.ySpeed = 0.0;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
//creating getter and setter methods
    public double getXSpeed() { return xSpeed; }
    public void setXSpeed(double xSpeed) { this.xSpeed = xSpeed; }

    public double getYSpeed() { return ySpeed; }
    public void setYSpeed(double ySpeed) { this.ySpeed = ySpeed; }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        return new double[]{xSpeed, ySpeed};
    }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}


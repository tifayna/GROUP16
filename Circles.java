class Circles extends Shape {
    private double radius = 1.0;

    public Circles() {}

    public Circles(double radius) {
        this.radius = radius;
    }
//create constructor with parameters
    public Circles(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
//create getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circles[" + super.toString() + ", radius=" + radius + "]";
    }
}



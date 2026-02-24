public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods
    @Override
    public double getArea() {
        
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    public double getVolume() {
        
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [" + super.toString() + ", height=" + height + "]";
    }
}

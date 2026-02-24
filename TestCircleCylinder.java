public class TestCircleCylinder {
    public static void main(String[] args) {
        // Create objects
        Cylinder cy1 = new Cylinder();
        Circle c1 = new Circle(2.0, "blue");

        //Testing
        System.out.println("Cylinder Info:");
        System.out.println("Radius: " + cy1.getRadius()
                + ", Height: " + cy1.getHeight()
                + ", Color: " + cy1.getColor()
                + ", Surface Area: " + cy1.getArea()
                + ", Volume: " + cy1.getVolume());


    }
}

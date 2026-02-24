public class Lab4_ShapeHierarchy {
    public static void main(String[] args) {

        System.out.println("=============================================");
        System.out.println("  Lab 4: Shape Hierarchy");
        System.out.println("=============================================\n");

        // Testing
        System.out.println("--- Section 1: Creating Objects ---");

        Shape s1 = new Shape("yellow", false);
        System.out.println(s1);

        Circles c1 = new Circles(5.0, "blue", true);
        System.out.println(c1);
        System.out.println("  Area: " + c1.getArea());
        System.out.println("  Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(4.0, 6.0, "green", true);
        System.out.println(r1);
        System.out.println("  Area: " + r1.getArea());
        System.out.println("  Perimeter: " + r1.getPerimeter());

        Square sq1 = new Square(5.0, "orange", false);
        System.out.println(sq1);
        System.out.println("  Area: " + sq1.getArea());
        System.out.println("  Perimeter: " + sq1.getPerimeter());

        
        System.out.println("\n--- Section 2: Square Invariant ---");

        Square sq2 = new Square(3.0);
        System.out.println("Initial: " + sq2);
        System.out.println("Width: " + sq2.getWidth() + ", Length: " + sq2.getLength());

        sq2.setWidth(7.0);
        System.out.println("\nAfter setWidth(7.0):");
        System.out.println("Width: " + sq2.getWidth() + ", Length: " + sq2.getLength());

        sq2.setLength(9.0);
        System.out.println("\nAfter setLength(9.0):");
        System.out.println("Width: " + sq2.getWidth() + ", Length: " + sq2.getLength());

        
        System.out.println("\n--- Section 3: Polymorphism ---");

        Shape[] shapes = {
                new Circles(3.0, "red", true),
                new Rectangle(4.0, 5.0, "blue", false),
                new Square(6.0, "green", true)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Circles) {
                totalArea += ((Circles) shape).getArea();
            } else if (shape instanceof Square) {
                totalArea += ((Square) shape).getArea();
            } else if (shape instanceof Rectangle) {
                totalArea += ((Rectangle) shape).getArea();
            }
        }

        System.out.println("Total area: " + totalArea);

        // Section 4
        System.out.println("\n--- Section 4: Inheritance Chain ---");

        Square sq3 = new Square(4.0, "cyan", true);

        System.out.println("sq3 instanceof Square:    " + (sq3 instanceof Square));
        System.out.println("sq3 instanceof Rectangle: " + (sq3 instanceof Rectangle));
        System.out.println("sq3 instanceof Shape:     " + (sq3 instanceof Shape));
        System.out.println("sq3 instanceof Object:    " + (sq3 instanceof Object));

        System.out.println("\nAll upcasts work!");
        System.out.println("\n=============================================");
        System.out.println("  End of Lab 4");
        System.out.println("=============================================");
    }
}

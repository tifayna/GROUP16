public class Lab3_PointMovablePoint {
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("  Lab 3: Point and MovablePoint");
        System.out.println("===============================================\n");

        // Testing    
        System.out.println("--- Section 1: Point Objects ---");

        Point p1 = new Point();
        System.out.println("Default point: " + p1);

        Point p2 = new Point(3.0, 4.0);
        System.out.println("Point at (3, 4): " + p2);

        p2.setX(5.0);
        p2.setY(6.0);
        System.out.println("After setX(5), setY(6): " + p2);

        double[] coords = p2.getXY();
        System.out.println("getXY() = [" + coords[0] + ", " + coords[1] + "]");


        
        System.out.println("\n--- Section 2: MovablePoint Objects ---");

        MovablePoint mp1 = new MovablePoint(0.0, 0.0, 2.0, 3.0);
        System.out.println("Initial position: " + mp1);

        System.out.println("X coordinate: " + mp1.getX());
        System.out.println("Y coordinate: " + mp1.getY());


        
        System.out.println("\n--- Section 3: Movement ---");

        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After 1st move: " + mp1);
        mp1.move();
        System.out.println("After 2nd move: " + mp1);
        mp1.move();
        System.out.println("After 3rd move: " + mp1);

        mp1.setSpeed(1.0, -1.0);
        System.out.println("\nSpeed changed to (1.0, -1.0)");
        mp1.move();
        System.out.println("After move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);


        
        System.out.println("\n--- Section 4: Polymorphism ---");

        Point p3 = new MovablePoint(1.0, 1.0, 0.5, 0.5);
        System.out.println("p3 (Point ref): " + p3);
        System.out.println("p3 class: " + p3.getClass().getSimpleName());

        

        if (p3 instanceof MovablePoint) {
            MovablePoint mp2 = (MovablePoint) p3;
            mp2.move();
            System.out.println("After downcast and move: " + mp2);
            System.out.println("p3 also changed: " + p3);
        }


        System.out.println("\n===============================================");
        System.out.println("  End of Lab 3");
        System.out.println("===============================================");
    }
}



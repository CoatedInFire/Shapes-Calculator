import java.util.Scanner;

public class MainProgram {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while (true) {
            System.out.println("""

                    ============== MAIN MENU ===============\

                         1. Square Computations \

                         2. Rectangle Computations\

                         3. Circle Computations\

                         4. Ellipse Computations\

                         5. Right Triangle Computations\

                         6. Trapezoid Computations\

                         7. Exit""");
            System.out.print("\n>> ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n 1. Square Computations ");
                    squareComputations();
                    break;
                case 2:
                    System.out.println("\n 2. Rectangle Computations");
                    rectangleComputations();
                    break;
                case 3:
                    System.out.println("\n 3. Circle Computations");
                    circleComputations();
                    break;
                case 4:
                    System.out.println("\n 4. Ellipse Computations");
                    ellipseComputations();
                    break;
                case 5:
                    System.out.println("\n 5. Right Triangle Computations");
                    rightTriangleComputations();
                    break;
                case 6:
                    System.out.println("\n 6. Trapezoid Computations");
                    trapezoidComputations();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("INVALID INPUT!!!!");
            }
            if (choice == 7) {
                System.out.println("Exiting Now!!!");
                break;
            }
        }
    }

    private static void squareComputations() {
        Square square = new Square();
        System.out.print("Input the side of the square: ");
        double side = scanner.nextDouble();
        square.setLengthOfSide(side);
        System.out.println("\nThe area is " + square.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + square.calculatePerimeter() + " units.");
    }

    private static void rectangleComputations() {
        Rectangle rect = new Rectangle();
        System.out.print("Input the length: ");
        double length = scanner.nextDouble();
        System.out.print("Input the width: ");
        double width = scanner.nextDouble();
        rect.setLength(length);
        rect.setWidth(width);
        System.out.println("\nThe area is " + rect.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + rect.calculatePerimeter() + " units.");
    }

    private static void circleComputations() {
        Circle circle = new Circle();
        System.out.print("Input the radius of the circle: ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println("\nThe area is " + circle.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + circle.calculatePerimeter() + " units.");
    }

    private static void ellipseComputations() {
        Ellipse ellipse = new Ellipse();
        System.out.print("Input the major axis of the ellipse: ");
        double majorAxis = scanner.nextDouble();
        System.out.print("Input the minor axis of the ellipse: ");
        double minorAxis = scanner.nextDouble();
        ellipse.setMajorAxis(majorAxis);
        ellipse.setMinorAxis(minorAxis);
        System.out.println("\nThe area is " + ellipse.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + ellipse.calculatePerimeter() + " units (approx.).");
    }

    private static void rightTriangleComputations() {
        RightTriangle triangle = new RightTriangle();
        System.out.print("Input the base of the right triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Input the height of the right triangle: ");
        double height = scanner.nextDouble();
        triangle.setBase(base);
        triangle.setHeight(height);
        System.out.println("\nThe area is " + triangle.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + triangle.calculatePerimeter() + " units.");
    }

    private static void trapezoidComputations() {
        Trapezoid trapezoid = new Trapezoid();
        System.out.print("Input the first base of the trapezoid: ");
        double base1 = scanner.nextDouble();
        System.out.print("Input the second base of the trapezoid: ");
        double base2 = scanner.nextDouble();
        System.out.print("Input the height of the trapezoid: ");
        double height = scanner.nextDouble();
        trapezoid.setBase1(base1);
        trapezoid.setBase2(base2);
        trapezoid.setHeight(height);
        System.out.println("\nThe area is " + trapezoid.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + trapezoid.calculatePerimeter() + " units.");
    }
}
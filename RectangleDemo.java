import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive.");
        }
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class RectangleDemo {   // ✅ Renamed this class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of rectangle: ");
            double length = Double.parseDouble(sc.nextLine());
            System.out.print("Enter width of rectangle: ");
            double width = Double.parseDouble(sc.nextLine());

            Shape rectangle = new Rectangle(length, width);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

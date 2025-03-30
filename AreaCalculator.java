public class AreaCalculator {
 
    private static final int INVALID_VALUE = -1;

    // Method to calculate area of a circle
    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        return radius * radius * Math.PI;
    }

    // Method to calculate area of a rectangle
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }
        return x * y;
    }

    public static void main(String[] args) {
        // Test cases for circle area
        System.out.println("Circle Area:");
        System.out.println(area(5.0));        // Output: 78.53981633974483 (π * 5^2)
        System.out.println(area(-1.0));       // Output: -1 (Invalid value)
        System.out.println(area(0));          // Output: 0.0 (radius = 0)
        
        // Test cases for rectangle area
        System.out.println("\nRectangle Area:");
        System.out.println(area(4.0, 5.0));    // Output: 20.0 (4 * 5)
        System.out.println(area(-4.0, 5.0));   // Output: -1 (Invalid value)
        System.out.println(area(3.5, 2.0));    // Output: 7.0 (3.5 * 2)
    }
}

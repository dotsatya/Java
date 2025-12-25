class Shape {
    public double calcArea(double side) {
        return side * side; 
    }

    public double calcArea(double length, double breadth) {
        return length * breadth; 
    }

    public double calcArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height; 
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Square: " + shape.calcArea(5));
        System.out.println("Area of Rectangle: " + shape.calcArea(5, 10));
        System.out.println("Area of Triangle: " + shape.calcArea(5, 10, true));
    }
}

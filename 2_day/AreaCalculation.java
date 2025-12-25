class Shape {
    public double area(int side) {
        return side * side; 
    }

    public double area(int length, int breadth) {
        return length * breadth; 
    }

    public double area(int base, int height, int triangle) {
        return 0.5 * base * height; 
    }

    public double area(double radius) {
        return Math.PI * radius * radius; 
    }

    public double area(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Square: " + shape.area(4));
        System.out.println("Area of Rectangle: " + shape.area(4, 6));
        System.out.println("Area of Triangle: " + shape.area(4, 6, 1));
        System.out.println("Area of Circle: " + shape.area(5.0));
        System.out.println("Length of Line: " + shape.area(0, 0, 3, 4));
    }
}

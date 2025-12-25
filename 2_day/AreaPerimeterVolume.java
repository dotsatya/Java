class Shape {
    double length, breadth, height;

    public Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class AreaPerimeterVolume {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter length, breadth, height: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        
        Shape shape = new Shape(length, breadth, height);
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Volume: " + shape.volume());
    }
}

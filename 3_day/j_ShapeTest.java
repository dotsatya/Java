abstract class Shape {
  abstract double calc_area();
  abstract double calc_volume();
}

class Sphere extends Shape {
  double radius;

  Sphere(double radius) {
      this.radius = radius;
  }

  double calc_area() {
      return 4 * Math.PI * radius * radius;
  }

  double calc_volume() {
      return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}

class Cone extends Shape {
  double radius, height;

  Cone(double radius, double height) {
      this.radius = radius;
      this.height = height;
  }

  @Override
  double calc_area() {
      double slantHeight = Math.sqrt(radius * radius + height * height);
      return Math.PI * radius * (radius + slantHeight);
  }

  double calc_volume() {
      return (1 / 3.0) * Math.PI * radius * radius * height;
  }
}

class Cylinder extends Shape {
  double radius, height;

  Cylinder(double radius, double height) {
      this.radius = radius;
      this.height = height;
  }

  double calc_area() {
      return 2 * Math.PI * radius * (radius + height);
  }

  double calc_volume() {
      return Math.PI * radius * radius * height;
  }
}

class Box extends Shape {
  double length, breadth, height;

  Box(double length, double breadth, double height) {
      this.length = length;
      this.breadth = breadth;
      this.height = height;
  }

  double calc_area() {
      return 2 * (length * breadth + breadth * height + height * length);
  }

  double calc_volume() {
      return length * breadth * height;
  }
}

public class j_ShapeTest {
  public static void main(String[] args) {
      Shape[] shapes = {
          new Sphere(5),
          new Cone(3, 7),
          new Cylinder(4, 10),
          new Box(4, 5, 6)
      };

      for (Shape s : shapes) {
          System.out.println("Area: " + s.calc_area());
          System.out.println("Volume: " + s.calc_volume());
      }
  }
}

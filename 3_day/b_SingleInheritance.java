class Vehicle {
  public void start() {
      System.out.println("Vehicle is starting...");
  }
}

class Car extends Vehicle {
  public void drive() {
      System.out.println("Car is driving...");
  }
}
public class b_SingleInheritance {
  public static void main(String[] args) {
      Car myCar = new Car();

      myCar.start();
      myCar.drive();
  }
}
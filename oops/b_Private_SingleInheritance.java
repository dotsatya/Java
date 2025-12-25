class Vehicle {
  public void start() {
      System.out.println("Vehicle is starting...");
  }
}

class Car extends Vehicle {
  private class Engine {
      public void startEngine() {
          System.out.println("Engine is starting...");
      }
  }

  public void drive() {
      Engine engine = new Engine(); // Create an instance of the private Engine class
      engine.startEngine(); // Call the startEngine method
      System.out.println("Car is driving...");
  }
}

public class b_Private_SingleInheritance {
  public static void main(String[] args) {
      Car myCar = new Car();

      myCar.start();  // Calls start() from Vehicle
      myCar.drive();  // Calls drive() from Car, which also starts the engine
  }
}

class Vehicle {                                              //This defines a new class named Vehicle. In Java, classes are blueprints for creating objects. The Vehicle class is the parent class (or superclass) in this  case.

  public void start() {
      System.out.println("Vehicle is starting...");        // declares a method named start in the Vehicle class. The public keyword means this method can be accessed from outside the Vehicle class. The void keyword indicates that this method doesn't return any value.
  }
}

class Car extends Vehicle {                                   // a new class named Car that extends (inherits from) the Vehicle class. extends indicates that Car inherits all the properties and methods of Vehicle, establishing single inheritance.

  public void drive() {
      System.out.println("Car is driving...");              // a new method named drive in the Car class. Like start, it is a public method and returns no value (void).
  }
}

public class a_SingleInheritance {
  public static void main(String[] args) {
      Car myCar = new Car();                                  //This line creates a new instance (object) of the Car class named myCar. The new keyword allocates memory for the object and calls the Car constructor.

      myCar.start();                                          //This line calls the start method on the myCar object. Since Car inherits start from Vehicle, this method prints "Vehicle is starting...".
      myCar.drive();
  }
}

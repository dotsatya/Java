class Vehicle {                                      

  public void start() {
      System.out.println("Vehicle is starting...");     
  }
}

class Car {                           

  public void drive() {
      System.out.println("Car is driving...");            
  }
}
class  bike extends Vehicle {

public class n {
  public static void main(String[] args) {
      Car myCar = new Car();                                  

      myCar.start();                                          
      myCar.drive();
  }
}

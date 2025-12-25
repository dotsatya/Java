class Calculator {
  // Method to add two integers
  public void add(int a, int b) {
    System.out.println(a+b);
  }

  // Overloaded method to add three integers
  public void add(int a, int b, int c) {
    System.out.println(a+b+c);
  }
}

public class FunctionOverloadingExample {
  public static void main(String[] args) {
      Calculator calc = new Calculator();

      // Using the first add method
      calc.add(10, 20);

      // Using the overloaded add method
 calc.add(10, 20, 30);
  }
}

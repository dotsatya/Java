class Binding {
  void print(String s) {
      System.out.println("Printing string: " + s);
  }

  void print(int i) {
      System.out.println("Printing integer: " + i);
  }
}

public class e_StaticBinding {
  public static void main(String[] args) {
      Binding b = new Binding();
      b.print("Hello");
      b.print(10);
  }
}

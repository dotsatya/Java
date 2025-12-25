class Parent {
  Parent() {
      System.out.println("Parent Constructor");
  }

  void display() {
      System.out.println("Parent Display");
  }
}

class Child extends Parent {
  Child() {
      super();
      System.out.println("Child Constructor");
  }

  void display() {
      super.display();
      System.out.println("Child Display");
  }
}

public class h_SuperKeywordExample {
  public static void main(String[] args) {
      Child c = new Child();
      c.display();
  }
}

class Person {
  String name;
  int age;

  // Default constructor
  Person() {
      this.name = "Unknown";
      this.age = 0;
  }

  // Parameterized constructor
  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Copy constructor
  Person(Person original) {
      this.name = original.name;
      this.age = original.age;
  }

  void display() {
      System.out.println("Name: " + name + ", Age: " + age);
  }
}

public class Main {
  public static void main(String[] args) {
      // Creating an object using parameterized constructor
      Person person1 = new Person("Alice", 25);
      System.out.println("Original Object:");
      person1.display();

      // Creating a copy of person1 using the copy constructor
      Person person2 = new Person(person1);
      System.out.println("Copied Object:");
      person2.display();

      // Modifying the copied object to verify it's a separate copy
      person2.name = "Bob";
      person2.age = 30;

      System.out.println("After Modifying the Copied Object:");
      System.out.println("Original Object:");
      person1.display();
      System.out.println("Copied Object:");
      person2.display();
  }
}


class Student {
  public int id;
  public char name;

  public void insert(int i, char n) {
    id = i;
    name = n;
  }

  public void display() {
    System.out.println("ID: " + id + ", Name: " + name);
  }
}

public class aa_SubObj {
  public static void main(String[] args) {
    Student s1 = new Student();       // Static object
    Student s2 = new Student();       // Static object
    Student s3 = new Student();       // Dynamic object (like C++'s `new`)

    s1.insert(1, 'A');
    s2.insert(2, 'B');
    s3.insert(3, 'C');
    // There's no equivalent for `(*s3)->insert(4, 'D');` in Java

    s1.display();
    s2.display();
    s3.display();
  }
}

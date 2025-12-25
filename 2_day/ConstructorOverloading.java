class ConstructorDemo {
    int number;

    public ConstructorDemo() {
        this.number = 0;
    }

    public ConstructorDemo(int number) {
        this.number = number;
    }

    public void display() {
        System.out.println("Number: " + number);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo(5);

        obj1.display();
        obj2.display();
    }
}

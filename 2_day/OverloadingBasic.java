class OverloadingDemo {
    public void display() {
        System.out.println("No argument method.");
    }

    public void display(int x) {
        System.out.println("Method with one argument: " + x);
    }

    public void display(int x, int y) {
        System.out.println("Method with two arguments: " + x + ", " + y);
    }
}

public class OverloadingBasic {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.display();
        obj.display(5);
        obj.display(5, 10);
    }
}

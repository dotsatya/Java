class StaticDemo {
    static int count = 0;

    public StaticDemo() {
        count++;
    }

    public static void showCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        StaticDemo.showCount();
    }
}

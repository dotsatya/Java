class PrivateDemo {
    private int number;

    private void showNumber() {
        System.out.println("Number: " + number);
    }

    public void setNumber(int number) {
        this.number = number;
        showNumber();
    }
}

public class PrivateVariables {
    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        obj.setNumber(10);
    }
}

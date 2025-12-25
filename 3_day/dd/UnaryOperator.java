class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    // Overloading the unary minus operator
    public MyNumber negate() {
        return new MyNumber(-this.value);
    }


    public void display() {
        System.out.println("Value: " + value);
    }

   
}
 
public class UnaryOperator {
    public static void main(String[] args) {
        MyNumber num1 = new MyNumber(5);
        MyNumber num2 = num1.negate(); // Negate the value of num1

        num1.display(); // Output: Value: 5
        num2.display(); // Output: Value: -5
    }

}
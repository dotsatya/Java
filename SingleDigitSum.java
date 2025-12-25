import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int result = reduceToSingleDigit(number);
        
        System.out.println("The single digit sum is: " + result);
        scanner.close();
    }
    
    public static int reduceToSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

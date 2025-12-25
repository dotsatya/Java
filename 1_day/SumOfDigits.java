public class SumOfDigits {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
	 while (num > 9) {
		sum = 0;
            	while (num != 0) {
                	sum += num % 10;
                	num /= 10;
            	}
	num = sum;
	}
        System.out.println("Single digit sum: " + sum);
    }
}


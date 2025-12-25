public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = Integer.parseInt(args[0]);
	int binary = 0 ;
	int i = 0;
	int placeValue = 1;
	 while (decimal > 0) {
            int rem = decimal % 2;
            binary = rem * placeValue + binary;
            decimal = decimal / 2;
            placeValue *= 10; // Move to the next place value (10, 100, 1000, ...)
        }		
        System.out.println("Binary representation: " + binary);
    }
}


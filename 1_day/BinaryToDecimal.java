public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = Integer.parseInt(args[0]);
        int decimal = 0 ;
        int placeValue = 1;
         while (binary > 0) {
            int digit = binary % 10;
            decimal = digit * placeValue + decimal;
            binary = binary / 10;
            placeValue *= 2; 
        }
        System.out.println("Binary to decimal: " + decimal);
    }
}

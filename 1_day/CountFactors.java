public class CountFactors {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = 0;

	System.out.println("Fectors are : ");

        for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
                  System.out.println(i);
		    count++;
            }
        }
        System.out.println("Number of factors: " + count);
    }
}

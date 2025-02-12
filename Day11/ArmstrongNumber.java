package Day11;
import java.util.Scanner;
public class ArmstrongNumber {
	public  boolean isArmstrong(int num) {
        int temp = num, sum = 0, count = 0;
        
        // Count the number of digits
        int n = num;
        while (n != 0) {
            count++;
            n /= 10;
        }

        // Calculate sum of each power of digit
        n = num;
        while (n != 0) {
            int digit = n % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            n /= 10;
        }

        return sum == temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the starting range: ");
	        int start = scanner.nextInt();

	        System.out.print("Enter the ending range: ");
	        int end = scanner.nextInt();

	        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
	        ArmstrongNumber ad=new ArmstrongNumber();
	        for (int i = start; i <= end; i++) {
	            if (ad.isArmstrong(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();

	}

}

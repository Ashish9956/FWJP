package Assignment2;
import java.util.*;
public class Ques7 {
	public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
	public static int power(int base, int exponent) {
        int result = 1, i = 0;
        do {
            result *= base;
            i++;
        } while (i < exponent);
        return result;
    }
	public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digit;
        int digits = countDigits(num);

        do {
            digit = temp % 10;
            sum += power(digit, digits);
            temp /= 10;
        } while (temp != 0);

        return sum == num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		 System.out.print(" Enter a number to check Armstrong: ");
	        num = sc.nextInt();
	        System.out.println(isArmstrong(num) ? "Armstrong Number" : "Not Armstrong");

	}

}

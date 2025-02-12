package Assignment2;
import java.util.*;
public class Ques6 {
	 public static int reverseNumber(int num) {
	        int reversed = 0;
	        for (; num != 0; num /= 10) {
	            reversed = reversed * 10 + num % 10;
	        }
	        return reversed;
	    }
	 public static boolean isPalindrome(int num) {
	        return num == reverseNumber(num);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number");
		int num=sc.nextInt();
		System.out.print("Is Palindrome: ");
		if(isPalindrome(num)) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
    
	}

}

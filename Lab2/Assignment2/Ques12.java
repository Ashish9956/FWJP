package Assignment2;
import java.util.*;import java.util.*;
public class Ques12 {
	 public static boolean isStringPalindrome(String str) {
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        return str.equals(reversed);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string to check palindrome: ");
        String str = sc.next();
        System.out.println(isStringPalindrome(str) ? "Palindrome" : "Not Palindrome");

	}

}

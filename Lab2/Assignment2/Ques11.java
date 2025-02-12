package Assignment2;
import java.util.*;
public class Ques11 {
	  public static boolean isStrongPassword(String pwd) {
	        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
	        for (int i=0;i<pwd.length();i++) {
	            if (pwd.charAt(i)>='A'&&pwd.charAt(i)<='Z') hasUpper = true;
	            else if (pwd.charAt(i)>='a'&&pwd.charAt(i)<='z') hasLower = true;
	            else if (pwd.charAt(i)>='0'&&pwd.charAt(i)<='9') hasDigit = true;
	            else hasSpecial = true;
	        }
	        return hasUpper && hasLower && hasDigit && hasSpecial;
	    }
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a password to check strength: ");
	        String password = sc.next();
	        System.out.println(isStrongPassword(password) ? "Strong Password" : "Weak Password");

		}
}

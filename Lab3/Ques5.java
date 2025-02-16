package Lab3;
import java.util.*;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
        String str = sc.next();
		 int lower = 0, upper = 0, digits = 0, special = 0;
		
	        for (int i=0;i<str.length();i++) {
	            if (str.charAt(i)>='A'&&str.charAt(i)<='Z') upper++;
	            else if (str.charAt(i)>='a'&&str.charAt(i)<='z') lower++;
	            else if (str.charAt(i)>='0'&&str.charAt(i)<='9') digits++;
	            else special++;
	        }
	        
	
	        System.out.println("Lowercase: " + lower + ", Uppercase: " + upper + ", Digits: " + digits + ", Special: " + special);
	   

}
}

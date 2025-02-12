package Assignment2;
import java.util.*;
public class Ques13 {

	public static int countChar(String str) {
        int count = 0;
        for (int i=0;i<str.length();i++) {
        	if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
             count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Enter a string to count characters: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print(str+" count of char: "+countChar(str));

	}

}

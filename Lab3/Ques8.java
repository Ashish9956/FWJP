package Lab3;
import java.util.*;
public class Ques8 {
	static boolean check(String str,int i,int j) {
		 while(i<j) {
		    	if(str.charAt(i++)!=str.charAt(j--)) return false;
		    }
		 return true;
	}
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	String str;
    System.out.println("Enter your String for testing palindrome");
    str=sc.next();
    int i=0;
    int j=str.length()-1;
    if(check(str,i,j)) System.out.println(str+" Is palindrome");
    else System.out.println(str+" Is not palindrome");
   
}
}

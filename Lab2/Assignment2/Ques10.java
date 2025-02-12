package Assignment2;
import java.util.*;
public class Ques10 {
	 public static void printMultiplicationTable(int num) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		  System.out.print("Enter a number to print multiplication table: ");
	        num = sc.nextInt();
	        printMultiplicationTable(num);

	}

}

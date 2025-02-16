package Lab3;

import java.util.Scanner;

public class Ques3 {

 
	
 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int oddCount = 0, evenCount = 0;
		    while (true) {
		        System.out.print("Enter a number (-1 to exit): ");
		        int num = sc.nextInt();
		        if (num == -1) break;
		        if (num % 2 == 0) evenCount++;
		        else oddCount++;
		        System.out.println("Total Even Numbers: " + evenCount);
			    System.out.println("Total Odd Numbers: " + oddCount);
		    }
		  
	}	 
}

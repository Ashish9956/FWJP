package Assignment2;
import java.util.*;
public class Ques8 {
	 public static boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a number to check prime: ");
		int num=sc.nextInt();
		System.out.print(num+" is Prime: "+isPrime(num));

	}

}

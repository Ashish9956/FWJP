package Lab3;
import java.util.*;
public class Ques10 {
	public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in)
				;
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
		System.out.println("Factorial of "+num+" is : "+factorial(num));
		
		
	}
}

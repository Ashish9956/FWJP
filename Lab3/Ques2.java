package Lab3;
import java.util.*;
public class Ques2 {
    public static int  grosssalary(int salary) {
    	return (salary>15000)?salary+(20*salary)/100+(60*salary)/100:salary+3000+(70*salary)/100;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			 System.out.print("Enter Basic Salary (-1 to exit): ");
			 int basic = sc.nextInt();
			 int gross=grosssalary(basic);
			 System.out.println("Gross Salary: " + gross); 
	
		}

	}

}

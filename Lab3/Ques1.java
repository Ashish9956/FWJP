package Lab3;
import java.util.*;

public class Ques1 {
	public int powercal(int base,int exp) {
		int res=1;
		for(int i=1;i<=exp;i++) {
			res*=base;
		}
		return res;
	}
	public int  digitcount(int num) {
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		return count;
	}
	public boolean armstrong(int num) {
		int temp=num;
		int digit;
		int sum=0;
		int exp =digitcount(temp);
		while(temp!=0) {
		digit=temp%10;
		sum+=powercal(digit,exp);
		temp/=10;
		
		}
		return num==sum;
		
		
	}
	 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Ques1 obj=new Ques1();
     System.out.println("Enter Start range: ");
     int s=sc.nextInt();
     System.out.println("Enter End range: ");
     int e=sc.nextInt();
     System.out.println("Answer are : ");
     for(int i=s;i<=e;i++) {
    	 if(obj.armstrong(i)) {
    		 System.out.print(i+" ");
    	 }
     }
        
 }
}

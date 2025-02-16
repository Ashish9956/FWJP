package Lab3;
import java.util.*;
public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		String str2="";
		System.out.println("enter yoour string ");
		str=sc.nextLine();

		int id=-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[') {
				str2+=str.charAt(i);
				id++;
			}
			else if(id!=-1&&str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']') {
				if((str2.charAt(id)=='('&&str.charAt(i)==')')){
					id--;
				}
				else if((str2.charAt(id)=='{'&&str.charAt(i)=='}')){
					id--;
				}
				else if((str2.charAt(id)=='['&&str.charAt(i)==']')){
					id--;
				}
			}
			else {
				System.out.println(str+" it invaid Parentheses");
			}
		}
		if(id==-1) {
			System.out.println(str+" it vaid Parentheses");
		}else {
			System.out.println(str+" it invaid Parentheses");
		}
		
		

	}

}

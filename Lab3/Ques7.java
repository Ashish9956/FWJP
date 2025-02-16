package Lab3;
import java.util.*;
public class Ques7 {
    static boolean search(int a,int b,String str1 , char ch) {
    	if(a==b) return false;
    	for(int i=a;i<str1.length();i++){
    		if(str1.charAt(i)==ch) return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		String str1="";
		System.out.println("Enter String :");
		str=sc.next();
		
		int len=0; 
		int i=0;
		int j=0;
		while(j<str.length()&&i<str.length()) {
			while(search(i,j,str1,str.charAt(j))) i++;
			str1+=str.charAt(j);
			len=Math.max(len, j-i+1);
			j++;
	       
	}
		System.out.println("max len string which contain nonrepeating "+len);
}
}

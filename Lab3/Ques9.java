package Lab3;

import java.util.Scanner;

public class Ques9 {
	static boolean check(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
				if(arr[i]==1) return false;
			   
			   }
		 return true;
	}
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	String str1,str2;
   int arr[]=new int[26];
   System.out.println("Enter your String for testing Anagram");
   System.out.println("Enter String Str1: ");
   str1=sc.next();
   System.out.println("Enter String Str2: ");
   str2=sc.next();
   for(int i=0;i<str1.length();i++) {
	  
	   arr[str1.charAt(i)-97]++;
	   arr[str2.charAt(i)-97]++;
   }
   if(check(arr)) System.out.println(str1+" and "+str2+" is Anagrams");
   else System.out.println(str1+" and "+str2+" is not Anagrams");
  
   
}
}

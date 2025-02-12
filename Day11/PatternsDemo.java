package pack1;

import java.util.Scanner;

public class PatternsDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
//		12345
//		1234
//		123
//		12
//		1
		
		
		for(int r=rows;r>=1;r--)  // r=5 4   r>=1
		{
			for(int c=1;c<=r;c++) // c=1 c<=4
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
//		       1      space = 4
//		      12	  space = 3
//		     123      space = 2
//		    1234      space = 1
//		   12345      space = 0
		
		for(int r=1;r<=5;r++)
		{
			for(int s=rows-1;s>=r;s--)  // 3 to 1
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

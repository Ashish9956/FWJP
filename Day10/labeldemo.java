package pack1;

import java.util.Scanner;

public class labeldemo {

	public static void main(String[] args) 
	{
		aa:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
					continue aa;
				System.out.println("j : "+j);
			}
			System.out.println("i : "+i);
		}

		System.out.println("-------------------------------");
		aa:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
					break aa;
				System.out.println("j : "+j);
			}
			System.out.println("i : "+i);
		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------------------------------");
		aa:
		for(int i=1;i<=5;i++)
		{
			System.out.println("i : "+i);
			bb:
			for(int j=1;j<=5;j++)
			{
				for(int k=1;k<=5;k++)
				{
					if(j==3)
						break aa;
					else if(j==5)
						break bb;
					System.out.println("j : "+j);
					System.out.println("k : "+k);
				}
			}
			
		}
		


		
		
		
		
	
		
	}

}

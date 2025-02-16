package Day14;

import java.util.Scanner;
public class arrayfuction {
	public int[] createArray(int size)
	{
		int a[]=new int[size];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value : ");
			a[i]=sc.nextInt();
		}
		return a;
	}
	
	public void display(int a[])
	{
		System.out.println("Array Elements : - ");
		for(int x:a) System.out.print(x+"\t");
		System.out.println("\n----------------------------------");
	}
	
	public static void main(String[] args) 
	{
		arrayfuction af=new arrayfuction();
		
		int x[]= af.createArray(5);
		
		System.out.println("Second array");
		
		int y[] = af.createArray(8);

		System.out.println("Array X Elements : - ");
		af.display(x);
		
		System.out.println("Array Y Elements : - ");
		af.display(y);
		
	}
}




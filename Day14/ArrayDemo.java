package Day14;

import java.util.Scanner;

public class ArrayDemo 
{
	int a[];
	Scanner sc;
	int idx;
	
	public ArrayDemo(int size) 
	{
		a=new int[size];
		sc=new Scanner(System.in);
		idx = -1;  // empty array
	}
	// length =10
// 		0	1	2	3	4	5	6	7	8	9
//		12	55	88	0	55	66	33	
//  idx = -1
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array :- ");
		ArrayDemo ad=new ArrayDemo(sc.nextInt());
		ad.menu();
	}
	
	public void menu()
	{
		int choice;
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Display Element of Array");
			System.out.println("2. Insert New Element at End");
			System.out.println("3. Insert New Element At First Index");
			System.out.println("4. Insert New Element By Position");
			System.out.println("5. Insert new element By Value");
			
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			
			if(choice==0)
			{
				System.out.println("GoodBye !!!");
			}
			else if(choice == 1) display();
			else if(choice == 2) insertLast();
			else if(choice == 3) insertFirst();	
			else if(choice == 4) insertByPosition();
			else if(choice == 5) insertByvalue();	
			else
				System.out.println("Wrong choice!Try Again!!");
			
		}while(choice!=0);
	}
	
	public void shiftRight(int index) // index = 0
	{
		for(int i=idx+1;i>index;i--) a[i]=a[i-1];
	}
	public void insertFirst()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{
			shiftRight(0);
			System.out.println("Enter a new value : ");
			a[0]=sc.nextInt();
			idx++;
			System.out.println("Array Insertion Successfull!!!");
		}
	}
	public int Search(int value) {
		for(int i=0;i<=idx;i++) {
			if(a[i]==value) {
				return i;
			}
		}
		return -1;
	}
	public void insertByPosition()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		System.out.println("Enter a Position you want to new value : ");
		int pos=sc.nextInt();
		pos--;
		if(0<=pos&&pos<=idx+1)
		{
			shiftRight(pos);
			System.out.println("Enter a new value : ");
			a[pos]=sc.nextInt();
			idx++;
			System.out.println("Array Insertion Successfull!!!");
		}
		else {
			System.out.println("Please Enter vaild position b/w 1 to "+(idx+2));
		}
	}
	public void insertByvalue()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{   
			System.out.println("Enter a  value : ");
			int value=sc.nextInt();
			int pos=Search(value);
			if(pos!=-1) {
				shiftRight(pos);
				System.out.println("Enter a new value : ");
				a[pos]=sc.nextInt();
				idx++;
				System.out.println("Array Insertion Successfull!!!");
			}
			else {
				System.out.println("value is not present");
				System.out.println("Try with other value");
			}
			
		}
	}
	public void insertLast()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{
			System.out.print("Enter a new Value : ");
			a[++idx] = sc.nextInt();// idx= -1 0 1, a[1]=45
			System.out.println("Array Insertion Successfull!!!");
		}
	}
	
	public void display()
	{
		System.out.println("Array Elements : - ");
		for(int x:a) System.out.print(x+"\t");
		System.out.println("\n----------------------------------");
	}
	public boolean isEmpty()
	{
		if(idx == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(idx == a.length-1)
			return true;
		else
			return false;
	}
	
	
}
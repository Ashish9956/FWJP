package pack1;

public class forloopdemo {

	public static void main(String[] args) 
	{
//		to print numbers from 1 to 10.
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}

//		int x=1;
//		for(;x<=10;)
//		{
//			System.out.println("hello");
//		}
		
//		for(;;)
//		{
//			System.out.println("hello");
//		}
		
		
//		for(;true;)
//		{
//			System.out.println("hello");
//		}
//		
		int x=1;
		
		for(;true;)
		{
			System.out.println("hello "+ x++);
			if(x==5) break;
		}
	}

}

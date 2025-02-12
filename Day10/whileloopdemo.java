package pack1;

public class whileloopdemo {

	public static void main(String[] args) 
	{
//		to print alphabets 
		int i=65;
		while(i<=90)
		{
			System.out.println(i+" : "+(char)i++);
		}
		
		System.out.println("-------------------------------------");
		
		i=97;
		do
		{
			System.out.println(i+" : "+(char)i);
		}
		while(++i<=122);
	}

}

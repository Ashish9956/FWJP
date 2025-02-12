package pack1;

import java.util.Scanner;

public class LoginDemo 
{
	public static void main(String[] args) 
	{
		String userid="abc.gmail.com";
		String password = "abc@123";

		Scanner sc=new Scanner(System.in);
		boolean loginStatus = false;
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter user id : ");
			String uid = sc.nextLine();
					
			if(uid.equalsIgnoreCase(userid))
			{
				System.out.println("Enter password : ");
				String pwd = sc.nextLine();
				if(pwd.equals(password))
				{
					System.out.println("Login Successfull!!");
					loginStatus=true;
//					statements after login successful operation
//					while(true)
//					{
//						System.out.println("1. Logout");
//						
//					}
					break;
				}
				else
				{
					System.out.println("Invalid Password!!");
				}
			}
			else
			{
				System.out.println("Invalid User Id!!!");
			}

		}

		if(!loginStatus) System.out.println("You have reached Maximum attempt Limit\nPlease try again Later!!");
	}

}

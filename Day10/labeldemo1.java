package pack1;

import java.util.Scanner;

public class labeldemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				
		int deptartments = 3;// no. of departments
		int employeesperdept = 4; // employees per department
		
		boolean taskAssigned = false;
		System.out.println("Enter Department number : ");
		int deptid = sc.nextInt();
		System.out.println("Enter employee no :");
		int empid = sc.nextInt();
		
		departments:
		for(int dept = 1;dept<=deptartments;dept++)
		{
			for(int emp=1;emp<=employeesperdept;emp++)
			{
				if(emp!=empid & dept!=deptid)
					continue;
				if(emp==empid && dept == deptid)
				{
					System.out.println("Employee "+emp+" from department "+dept+" is on leave. ");
					continue;
				}
				System.out.println("Task assigned to Employee : "+emp+" from department : "+dept);
				taskAssigned=true;
				break departments;
			}
		}
		if(!taskAssigned) System.out.println("No Available employees to assign the task");

	}

}

package Day12;
import java.util.*;
public class accessStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    student s1=new student();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Roll No: ");
    s1.setRollno(sc.nextInt());
    sc.nextLine();
    System.out.println("Enter Neme: ");
    s1.setName(sc.nextLine());
    System.out.println("Enter Age: ");
    s1.setAge(sc.nextInt());
    System.out.println("Enter Salary: ");
    
    s1.setSalary(sc.nextFloat());
    System.out.println("Student 1 : "+s1);
    student s2=new student(101,"ashish",26,40000);
    
    System.out.println("Student 2 : "+s2);
	}

}

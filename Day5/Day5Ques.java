import java.util.*;
class Day5Ques {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);

    // leap year or not
     
      System.out.print("Enter a year : ");
      int year=sc.nextInt();
      Boolean res=(year%4==0&&year%100!=0)||year%400==0;
      System.out.print("it is  leap year : "+res);

   // Salary Bonus
      
        System.out.print("Enter a Salary and Experience : ");
        int sly=sc.nextInt();
        int exp=sc.nextInt();
        int result=exp>20?sly+(20*sly)/100:sly+(10*sly)/100;
System.out.print("Your Total salary after add your bonus is : "+result); 

 // Person voter age check

       
        System.out.print("Enter your  age : ");
        int age=sc.nextInt();
        
        String  str=age>=18? " You are eligible for vote":" you are not eligible for vote";
System.out.print(str);

// check number is neg/post/zero

        System.out.print("Enter your  number : ");
        int n=sc.nextInt();
   
         System.out.println("Number is positive : "+(n>0));
System.out.println("Number is zero : "+(n==0));
System.out.println("Number is negative : "+(n<0));

        
            }
}
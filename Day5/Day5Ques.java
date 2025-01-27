import java.util.*;
class Day5Ques {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);

    // leap year or not
     
      System.out.print("Enter a year : ");
      int year=sc.nextInt();
      Boolean res=(year%4==0&&year%100!=0)||year%400==0;
      System.out.println("it is  leap year : "+res);

   // Salary Bonus
      
        System.out.print("Enter a Salary and Experience : ");
        int sly=sc.nextInt();
        int exp=sc.nextInt();
        int result=exp>20?sly+(20*sly)/100:sly+(10*sly)/100;
System.out.println("Your Total salary after add your bonus is : "+result); 

 // Person voter age check

       
        System.out.print("Enter your  age : ");
        int age=sc.nextInt();
        
        String  str=age>=18? " You are eligible for vote":" you are not eligible for vote";
System.out.println(str);

// check number is neg/post/zero

        System.out.print("Enter your  number : ");
        int n=sc.nextInt();
   
         System.out.println("Number is positive : "+(n>0));
System.out.println("Number is zero : "+(n==0));
System.out.println("Number is negative : "+(n<0));

        // check number is even or odd
       
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        
        System.out.println(num%2==0?"Number is even" :" Number is odd");

  //1. Check whether the character is alphabet or not
 // 2. If character is alphabet then check if it is in lower case or upper case
 //3. If it is in upper case then convert it into lower case
//4. Check if it is vowel or not

        System.out.print("Enter a character  ");
        char  ch=sc.next().charAt(0);
        boolean lc=ch>=97&&ch<=122;
        boolean uc=ch>=65&&ch<=90;
        boolean alp=lc||uc;
        boolean vl=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
        System.out.println("It is alphabet : "+alp);
        System.out.println("It lower case : "+lc);
        System.out.println("It upper case : "+uc); 
       System.out.print( uc?(ch+" It lower case is : "+(char)(ch+32)+'\n'):"");
        System.out.println("It is vowel : "+vl);  

        
            }
}

import java.util.*;
class RelationalDemo {
// Relation Operator
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any two values : ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        
       System.out.println("A is greater than B: "+(a>b));
        System.out.println("A is greater than equal to B: "+(a>=b));
 System.out.println("A is less than B: "+(a<b));
 System.out.println("A is less  than equal to B: "+(a<=b));
 System.out.println("A is equal to B: "+(a==b));
 System.out.println("A is not equal to B: "+(a!=b));
    }
}
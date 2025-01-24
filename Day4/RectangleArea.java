import java.util.*;
class  RectangleArea{
    public static void main(String[] arg) {
        int a,b;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of a and b : " );
        a=sc.nextInt();
        b=sc.nextInt();
        int Area = a*b;  
        System.out.println("Area : " + Area);
    }
}
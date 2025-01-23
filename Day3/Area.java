import java.util.*;
class Area {
    public static void main(String[] arg) {
        float pi = 3.14f;
       // float r = 3.5f;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Radius: " );
         float r;
         r=sc.nextFloat();
        float Area = pi*r*r;  
        System.out.println("Area : " + Area);
    }
}
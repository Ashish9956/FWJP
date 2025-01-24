import java.util.*;
class Percentage {
    public static void main(String[] arg) {
        int mark ;
        int maximark;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mark : ");
        mark=sc.nextInt();
        System.out.println("enter maximax: ");
        maximark=sc.nextInt();
        float percentage = ((float) mark / maximark) * 100;  
        System.out.println("Percentage : " + percentage);
    }
}
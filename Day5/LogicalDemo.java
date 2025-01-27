import java.util.*;
class LogicalDemo {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch=sc.next().charAt(0);
        boolean lowerch=ch>=97&&ch<=122;
        boolean upperch=ch>=65&&ch<=90;
        boolean alph=lowerch||upperch;
        System.out.println(ch+" is lower case : "+lowerch);
         System.out.println(ch+" is upperch case : "+upperch);
 System.out.println(ch+" is Alphabet : "+alph);
  System.out.println(ch+" is not Alphabet : "+!alph);
            }
}
import java.util.*;
class TernaryDemo {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a two vlaues : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a>b? "A is greater":"B is greater");
int res=a>b?a-b:b-a;
System.out.print("result is  : "+res);
        
                    }
}
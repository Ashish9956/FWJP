import java.util.*;
class Acciivalueadd {
    public static void main(String[] arg) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character : " );
        ch=sc.next().charAt(0);
        System.out.println("Acci of:"+ch +" is ->"+((int)ch+32));
    }
}
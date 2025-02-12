package Assignment2;

public class Ques1_2 {

	 public static void printNEvenNum(int n) {
	        for (int i = 1, num = 2; i <= n; i++, num += 2) {
	            System.out.print(num + " ");
	        }
	    }
	  public static void main(String[] args) {
       printNEvenNum(10);
}
}

package Assignment2;

public class Ques5 {
	 public static int reverseNumber(int num) {
	        int reversed = 0;
	        for (; num != 0; num /= 10) {
	            reversed = reversed * 10 + num % 10;
	        }
	        return reversed;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
    System.out.print("OriginalNo.:"+num+" after reverse: "+reverseNumber(123));
	}

}

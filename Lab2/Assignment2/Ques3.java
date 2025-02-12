package Assignment2;

public class Ques3 {
	 public static int countDigits(int num) {
	        int count = 0;
	        while (num != 0) {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=countDigits(100);
		 System.out.println(n);
		

	}

}

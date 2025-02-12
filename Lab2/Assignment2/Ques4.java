package Assignment2;

public class Ques4 {
	 public static int power(int base, int exponent) {
	        int result = 1, i = 0;
	        do {
	            result *= base;
	            i++;
	        } while (i < exponent);
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print(power(2,3));
		

	}

}

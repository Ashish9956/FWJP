package Lab3;

import java.util.Scanner;


public class Ques4 {
	 public  boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 public boolean isArmstrong(int num) {
	        int Num = num;
	        int originalNum=num;
	        int sum = 0;
	        int count = 0;
	        while (Num != 0) {
	            Num /= 10;
	            count++;
	        }
	     
	        while (num != 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, count);
	            num /= 10;
	        }
	        return sum == originalNum;
	    }
	 public void printFibonacciSeries(int n) {
	        int firstTerm = 0, secondTerm = 1;
	        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
	        for (int i = 3; i <= n; i++) {
	            int nextTerm = firstTerm + secondTerm;
	            System.out.print(", " + nextTerm);
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	        System.out.println();
	    }
	 public boolean isEven(int num) {
	        return num % 2 == 0;
	    }
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Ques4 obj=new Ques4();
		 int choice;
		 while(true){
	            System.out.println("\nMenu:");
	            System.out.println("1. Check Prime Number");
	            System.out.println("2. Check Armstrong Number");
	            System.out.println("3. Print Fibonacci Series");
	            System.out.println("4. Check Even Number");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
                if(choice==5) break;
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter a num : ");
	                    int primeNumber = scanner.nextInt();
	                    if (obj.isPrime(primeNumber)) {
	                        System.out.println(primeNumber + " is a prime no.");
	                    } else {
	                        System.out.println(primeNumber + " is not a prime no.");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter a num : ");
	                    int armstrongNumber = scanner.nextInt();
	                    if (obj.isArmstrong(armstrongNumber)) {
	                        System.out.println(armstrongNumber + " is an Armstrong no.");
	                    } else {
	                        System.out.println(armstrongNumber + " is not an Armstrong no.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter the num : ");
	                    int terms = scanner.nextInt();
	                    obj.printFibonacciSeries(terms);
	                    break;
	                case 4:
	                    System.out.print("Enter a num : ");
	                    int evenNumber = scanner.nextInt();
	                    if (obj.isEven(evenNumber)) {
	                        System.out.println(evenNumber + " is an even nor.");
	                    } else {
	                        System.out.println(evenNumber + " is not an even no.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting main programm.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        } 

	        scanner.close();
	 }
			 
		 
}


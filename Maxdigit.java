package demo;

	import java.util.Scanner;

	public class Maxdigit {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int maxDigit = findMaxDigit(number);

	        System.out.println("The maximun digit is: " + maxDigit);
		}
	      
	    

	    public static int findMaxDigit(int number) {
	        
	        int maxDigit = 1;
	       
	        while (number != 0) {
	            int digit = number % 10;
	            
	            
	            if (digit > maxDigit) {
	            	maxDigit = digit;
	            }
	            
	            number =number/10;
	        }
	        
	        return maxDigit;
	}
	}


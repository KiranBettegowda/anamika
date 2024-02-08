package demo;

import java.util.Scanner;

public class Mindigit {
public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int minDigit = findMinDigit(number);

	        System.out.println("The minimum digit is: " + minDigit);
	    }

	    public static int findMinDigit(int number) {
	        
	        int minDigit = 9;
	       
	        while (number != 0) {
	            int digit = number % 10;
	            
	            
	            if (digit < minDigit) {
	                minDigit = digit;
	            }
	            
	            number =number/10;
	        }
	        
	        return minDigit;
	    
}
}

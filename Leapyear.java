package demo;

import java.util.Scanner;

public class Leapyear {
public static void main(String[] args) {
	//2.Write a program to print the next 20 leap years from a given year?
	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        int count = 0;
	        int nextYear = year;

         System.out.println("Next 20 leap years from " + year + " are:");
	        while (count < 20) {
	            if (isLeapYear(nextYear)) {
	                System.out.println(nextYear);
	                count++;
	            }
	            nextYear++;
	        }
	    }

	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	}



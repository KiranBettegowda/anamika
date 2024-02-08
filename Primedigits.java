package demo;

public class Primedigits {
public static void main(String[] args) {
	//Write a program to print the sum of the prime digits of an entered number? 
	int no=23456789;
	int sum=0;
	while(no!=0){
		int rem=no%10;
		boolean flag=true;
		
			for(int i=2;i<rem;i++){
				if(rem%2==0){
					flag=false;
					
				}
			}
		
		if(flag==true){
			sum=sum+rem;
		}
		no=no/10;
	}
	System.out.println(sum);
}
}

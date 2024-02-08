package demo;

public class Sum {
public static void main(String[] args) {
	//Write a program to print whether the sum of digits of an entered number of odd or even?
	int no=7895;
	int sum=0;
	while(no!=0){
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
	if(sum%2==0){
		System.out.println(sum+ " is a even number");
	}else{
		System.out.println(sum+ " is a odd number");
	}
}
}

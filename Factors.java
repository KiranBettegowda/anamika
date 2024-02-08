package demo;

public class Factors {
public static void main(String[] args) {
	//Write a program to print factors of each digit of an entered number?
	int no=345;
	while(no!=0){
		int rem=no%10;
		int fact=1;
		for(int i=1;i<=rem;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		no=no/10;
	}
}
}

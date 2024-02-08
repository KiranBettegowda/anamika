package demo;

public class Palindrome {
public static void main(String[] args) {
	//13 Write a program to print the possible palindrome in a given sentence.
	String str="hello madam my name kiran";
	String[] str1=str.split(" ");
	for(int i=0;i<str1.length;i++){
		String str2=str1[i];
		String rev="";
		for(int j=str2.length()-1;j>=0;j--){
			rev=rev+str2.charAt(j);
		}
		if(str2.equals(rev)){
			System.out.print(str2);
		}
	}
}
}

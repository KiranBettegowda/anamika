package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayrotation {
public static int[] main(int[]arr,int n){
	for(int i=1;i<=n;i++){
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++){
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=first;
	}
	return arr;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=sc.nextInt();
	int[]arr=new int[size];
	System.out.println("enter the elements");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt(); 
	}
	System.out.println("how many times rotate an array");
	int n=sc.nextInt();
	sc.close();
	
	int[]res=main(arr,n);
	for(int ele:res){
		System.out.print(ele+" ");
	}
}
}

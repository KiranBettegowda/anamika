package demo;

import java.util.Arrays;

public class Arraysort {
public static void main(String[] args) {
	int[]a={3,4,6,7,9,1,2,5};
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length-1;j++){
			if(a[j]>a[j+1]){
		  int temp=a[j];
		  a[j]=a[j+1];
		  a[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
}
}

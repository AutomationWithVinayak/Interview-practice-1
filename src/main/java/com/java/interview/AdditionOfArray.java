package com.java.interview;

public class AdditionOfArray {
	
	public static void main(String[] args) {
		 int a[]= new int[4];
		 a[0]=1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 
		 int sum=0;
		 
		 for(int i=0; i<a.length;i++) {
			 sum=sum+a[i];
		 }
		 System.out.println(sum);
		
	}

}

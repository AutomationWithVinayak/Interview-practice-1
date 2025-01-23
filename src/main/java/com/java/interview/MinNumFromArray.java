package com.java.interview;

public class MinNumFromArray {
	
	
	public static void main(String[] args) {
		
		int a[]  = new int[4];
		a[0]=1;
		a[1]=5;
		a[2]=2;
		a[3]=3;
		
		int max =3;
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

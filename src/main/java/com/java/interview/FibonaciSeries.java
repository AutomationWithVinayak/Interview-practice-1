package com.java.interview;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		
		int a=-1,b=1,c;
		
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

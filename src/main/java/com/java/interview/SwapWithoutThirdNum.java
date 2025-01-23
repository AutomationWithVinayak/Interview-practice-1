package com.java.interview;

public class SwapWithoutThirdNum {
	
	
	public static void main(String[] args) {
		int x=10,y=20;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		int z;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		
	}

}

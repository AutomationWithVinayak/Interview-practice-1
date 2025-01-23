package com.java.interview;

public class PalidromNum {
	
	public static void main(String[] args) {
		
		
		int rem, sum , p;
		int num =101;
		p=num;
		for(sum=0;num>0;num=num/10) {
			rem =num%10;
			sum= sum*10+rem;
		}
		if(sum == p) {
			System.out.println("number is palidrom");
		}
		else {
			System.out.println("not pali");
		}
	}

}

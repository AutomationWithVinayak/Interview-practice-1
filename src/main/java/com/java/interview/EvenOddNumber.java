package com.java.interview;

public class EvenOddNumber {

	public static void main(String[] args) {
		oddNum(7);
		evenNum(10);

	}

	public static void oddNum(int a) {

		if(a % 2 == 0){
			System.out.println("Even NUmver");
		}
		else {
			System.out.println("Odd Number");
		}
	}

	public static void evenNum(int a) {
		if(a % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}

package com.java.interview;

public class MaxNumberFromArray {

	public static void main(String[] args) {


		int a[] = {1,4,7,100,9,2,3,6};
		int max =a[0];
		for(int i=0; i<a.length; i++) {

			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println(max);
	}

}

package com.interview.repeat;

public class LargestNumFromArray {


	public static void maxNum() {

		int a[] = {1,3,7,2,5,3,4,34,54,65,76,878,67,89,90};
		int max =a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i] > max) {
				max= a[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		maxNum();
	}

}

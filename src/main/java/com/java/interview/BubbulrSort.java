package com.java.interview;

public class BubbulrSort {


	public static void main(String[] args) {

		int a[] = {1,23,58,700,5,6,800,900,1258,55,66};

		for(int i =0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}		
		}
		
		System.out.println(a[a.length-2]);

	}

}

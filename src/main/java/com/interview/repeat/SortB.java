package com.interview.repeat;

public class SortB {

	public static void sortArray() {

		int a[] = {25,58,36,69,14,47,74,41,85,52,96,63};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp ;
				}
			}
		}
			System.out.println(a[a.length-1]);
			System.out.println(a[a.length-2]);
	}
	
	public static void main(String[] args) {
		sortArray();
	}

}

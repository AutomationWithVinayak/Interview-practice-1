package com.interview.repeat;

import java.util.HashSet;
import java.util.Set;
//classtest
public class DiplicatesArray {

	public static void duplicateNumInArray() {

		int a[]= {1,2,3,4,5,61,2,3,2,3};
		Set<Integer> duplicateValue = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			for(int j =i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					duplicateValue.add(a[i]);
				}
				
			}
		}
		System.out.println(duplicateValue);
	}

	public static void main(String[] args) {
		duplicateNumInArray();
	}

}

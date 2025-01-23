package com.java.interview;

import java.util.Scanner;

public class TargetNum {
	
	public static void main(String[] args) {
		
		int target =7;
		int arr[]= {1,2,3,4,5};
		
//		for(int i=0;i<arr.length; i++) {
//			for(int j=i; j<arr.length; j++) {
//				if(arr[i]+arr[j] == target) {
//					System.out.println(" index : "+i+" and "+j+"  total is : "+target);
//				}
//			}
//		}
//		
		
		custFn();
		
   }
		
		
	
	public static void custFn() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many Number do you want in array");
		
		int len = sc.nextInt();
		
		int a[] = new int[len];
		
		System.out.println("Enter Those Numbers : ");
		
		for(int i=0;i<a.length;i++){
			a[i] =sc.nextInt();
		}
		
		System.out.println("Enter Target Number : ");
		int target = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]+a[j] == target) {
					System.out.println(" index : "+i+" and "+j+"  total is : "+target);
				}
			}
		}
		
	}

}

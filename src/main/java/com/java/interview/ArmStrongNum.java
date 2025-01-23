package com.java.interview;

public class ArmStrongNum {

	public static void main(String[] args) {

		int sum, rem , p;
		int num =153;
		p=num;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum == p) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
	}

}

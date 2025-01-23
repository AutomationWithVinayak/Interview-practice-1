package com.java.interview;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
	
		String name = "Vinayak";
		StringBuilder  sb  = new StringBuilder();
		
		for(int i=0; i<name.length(); i++) {
			int count =0;
			for(int j=0; j<i+1; j++) {
				if(name.charAt(i) == name.charAt(j)) {
					count ++;
					if(count >=2) {
						break;
					}
				}
			}
			
			if(count != 2) {
				sb.append(name.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
	
}

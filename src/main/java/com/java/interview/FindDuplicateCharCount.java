package com.java.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharCount {

	public static void main(String[] args) {

		String name = "Vinayak Waman Bhandurge";
		Map<Character, Integer> obj  = new LinkedHashMap<Character, Integer>();

		for(int i =0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch != ' ') {
				if(obj.containsKey(ch)) {
					obj.put(ch, obj.get(ch)+1);
				}
				else {
					obj.put(ch,1);
				}
			}
		}
		System.out.println(obj);
	}


}

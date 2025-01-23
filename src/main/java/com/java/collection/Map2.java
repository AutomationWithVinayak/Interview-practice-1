package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map2 {


	public static void main(String[] args) {

		HashMap<String, Integer> obj = new HashMap<>();

		obj.put("one", 1);
		obj.put("two", 2);
		obj.put("three",3);
		obj.put("four", 4);

//   	System.out.println(obj);
//
//		obj.remove("four");
//
//		System.out.println(obj);
//
//		obj.put("four", 4);
//
//		System.out.println(obj);
//
//		System.out.println(obj.get("one"));
//
//		System.out.println(obj.values());
//
//		System.out.println(obj.keySet());
//
//		Iterator<Map.Entry<String, Integer>> obj2 = obj.entrySet().iterator();
//		while(obj2.hasNext()){
//			Map.Entry<String, Integer> entry=obj2.next();
//			String key = entry.getKey();
//			int val = entry.getValue();
//			System.out.println(key +" : "+val);
//		}

//		for(Map.Entry<String, Integer> entry : obj.entrySet()) {
//			String key = entry.getKey();
//			int val = entry.getValue();
//			System.out.println(key+" : "+val);
//		}
		
		
		//-------------------------------
		
		
		LinkedHashMap<String, Integer> obj3 = new LinkedHashMap<>(obj);
		
		obj3.put("one", 1);
		obj3.put("two", 2);
		obj3.put("three",3);
		obj3.put("five", 5);
		
		System.out.println(obj3);
		
		HashMap sh =(HashMap)obj.clone();
		sh.remove("four");
		System.out.println(sh);
		System.out.println(obj);
		
		
		
		

	}

}

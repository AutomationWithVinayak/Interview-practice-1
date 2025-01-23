package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {


	public static void main(String[] args) {

		// HashMap - order of insertion not maintain


		HashMap< String, Integer> o = new HashMap<>();

		//	System.out.println(o.size());

		o.put("Vinayak", 1);
		o.put("Vicky", 2);
		o.put("Number", 777);

		//	System.out.println(o.size());

		//		System.out.println(o);
		//		System.out.println(o.get("Vicky"));
		//		System.out.println(o.values());
		//		
		//		System.out.println(o.keySet());
		//		System.out.println(o.remove("Number"));
		//		System.out.println(o.values());
		//		System.out.println(o.keySet());
		//		o.put("Number", 777);
		//		System.out.println(o.values());
		//		System.out.println(o.keySet());
		//		
		//		System.out.println(o.entrySet());

		//		for(Map.Entry<String, Integer> entry : o.entrySet()) {			
		//			String keys = entry.getKey();
		//			Integer val= entry.getValue();
		//			System.out.println(keys +" : "+val);			
		//		}

		Iterator<Map.Entry<String, Integer>> obj = o.entrySet().iterator();
		while(obj.hasNext()) {
			Map.Entry<String, Integer> nObj = obj.next();
			String key  = nObj.getKey();
			int val = nObj.getValue();
			System.out.println(key +" : "+val);
		}



	}

}

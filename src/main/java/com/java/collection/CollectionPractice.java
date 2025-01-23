package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionPractice {


	public static void main(String[] args) {
		//		
		//		ArrayList<String> obj = new ArrayList<String>(); // type safe declearion
		//		
		//		obj.add("Vicky");
		//		obj.add("Vinayak");
		//		obj.add("lonar");
		//		obj.add("buldhana");


		//		System.out.println("size : "+obj.size());
		//		System.out.println("getFirst : "+obj.getFirst());
		//		System.out.println("getLast : "+obj.getLast());
		//		System.out.println("get : "+obj.get(1));
		//		System.out.println("set : "+obj.set(1, "vinayak"));
		//		System.out.println("get : "+obj.get(1)); 
		//		System.out.println("contains : "+obj.contains("lonar"));
		//		System.out.println("indexOf : "+obj.indexOf("buldhana"));
		//		System.out.println(obj.removeLast());
		//		System.out.println(obj.getLast());

		//		ArrayList obj2  =  new ArrayList();  // un type safe deleceration
		//		obj2.add("Vinayak");
		//		obj2.add(1);
		//		obj2.add(null);
		//		obj2.add(1.5);
		//		obj2.add(1);



		// array = obj.length
		// String = obj.length()
		// ArrayList = size()

		//		for(int i=0; i<obj2.size(); i++) {
		//			
		//			System.out.println(obj2.get(i));
		//		}

		//		for(Object o :obj2) {
		//			System.out.println(o);
		//		}

		//		Iterator<Object> vn=obj2.iterator();
		//		while(vn.hasNext()) {
		//			System.out.println(vn.next());
		//		}

		//		ListIterator<Object> vn2 =obj2.listIterator();
		//		while(vn2.hasNext()) {
		//			System.out.println(vn2.next());
		//		}

		//		
		//		Set obj= new HashSet();    // un safe typed decleration
		//		Set<String> obj2 = new HashSet(); // safe decleration
		//		
		//		
		//		
		//		HashSet obj3 = new HashSet();
		//		HashSet<Integer> obj4 = new HashSet();
		//		
		//		








		Set<String> hashSet = new HashSet<>();

		hashSet.add("beed");
		hashSet.add("karad");
		hashSet.add("deshmukh");

		System.out.println(hashSet.contains("beed"));
		System.out.println(hashSet.contains("buldhana"));
		System.out.println();

       
		String str = "";
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			String firstElement = iterator.next();
			if(firstElement.equals("karad")) {
				str = firstElement;
			}
		}
		
		System.out.println(str);

		
		Set<String> linkedHashSet = new LinkedHashSet<>();
       
        linkedHashSet.add("Selenium");
        linkedHashSet.add("Java");
        linkedHashSet.add("Automation");
        linkedHashSet.add("Testing");
        linkedHashSet.add(null);              // Allowed
        linkedHashSet.add("Java");          // Duplicate, ignored
        
        for(int i=0; i<linkedHashSet.size(); i++) {
        	
        	
        }












	}

}

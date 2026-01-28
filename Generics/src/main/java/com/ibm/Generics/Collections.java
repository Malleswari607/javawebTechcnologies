package com.ibm.Generics;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {
	public Map<Integer,String> getData(){
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1,"A");
		hashmap.put(2,"C");
		hashmap.put(3,"B");
		hashmap.put(4,"E");
		hashmap.put(5,"D");
		return hashmap;
	}
	public static void main(String[] args) {
		
		//method1 
//		for(String s1:arraylist) {
//			System.out.println(s1);
//		}
		//method2 
//		Iterator<String> iterator=arraylist.iterator();
//		while(iterator.hasNext()) { 
//			String text=iterator.next();
//			System.out.println(text);
		
//		}
		Collections collections=new Collections();
		Map<Integer,String> data=collections.getData();
//		Set<Integer> keys=data.keySet();
//		Iterator<Integer> keyIterator=keys.iterator();
//		while(keyIterator.hasNext()) {
//			Integer key = keyIterator.next();
//			String value=data.get(key);
//			System.out.println(key+"---->"+value); 
		
//	}
		Set<Entry<Integer,String>> entryset=data.entrySet();
		Iterator<Entry<Integer,String>> entrysetiterator=entryset.iterator();
		while(entrysetiterator.hasNext()) {
			Entry<Integer, String> entry=entrysetiterator.next();
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
}
}

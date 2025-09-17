package com.dev;
import java.util.*;
/*
 * set - only unique elements
 * HashSet - hashing
 */
public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("LS");
		hset.add("Gokul");
		hset.add("Arun");
		hset.add("Gokul");
		hset.add("Lokesh");
		hset.add("LS");
		hset.add("Steve");
		System.out.println(hset);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(4);
		lhs.add(54);
		lhs.add(43);
		lhs.add(64);
		lhs.add(64);
		System.out.println(lhs);
		
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Apple");
		tset.add("Dog");
		tset.add("apple");
		tset.add("Banana");
		tset.add("eat");
		tset.add("Cat");
		tset.add("Apple");
		System.out.println(tset);
		
		
	}

}

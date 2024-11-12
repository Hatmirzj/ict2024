package com.ict.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ColelctionDemo {

	public static void main(String[] args) {
		
		//Vector<Object> a=new Vector<>();
		ArrayList<Object> a=new ArrayList<>();
		//LinkedList<Object> a=new LinkedList<>();
		//	HashSet<Object> a=new HashSet<>();
		a.add(45);
		a.add("java");a.add("java");a.add("java");
		a.add(new Date());
		a.add(34534.2332);
		a.add(23);
		a.add(67);
		a.add(56);
		a.add(67);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove(2));
		//System.out.println(a.indexOf(67));
		//System.out.println(a.lastIndexOf(67));
		System.out.println(a.isEmpty());
		System.out.println(a.contains(23));
		/*
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int i1=0;i1<a.size();i1++)
			System.out.println(a.get(i1));
		
		for(Object o:a)
			System.out.println(o);
		*/
		
		a.forEach(x->System.out.println(x));
		
		TreeMap<String ,String>  map=new TreeMap<>();
		map.put("Tanzania","Dodoma");
		map.put("Kenya","Nairobi");
		map.put("ArushaState","Dodoma1");
		map.put("Tanzania2","Dodoma2");
		map.put("Bon","city");
		System.out.println(map);
		Set states=map.keySet();
		System.out.println(states);
		
		Collection capitals=map.values();
		System.out.println(capitals);
		
		Set entries=map.entrySet();
		
		Iterator i=entries.iterator();
		
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		//LinkedHashSet<Integer> l=new LinkedHashSet<>();
		//HashSet<Integer> l=new HashSet<>();
		TreeSet<Integer> l=new TreeSet<>();
		l.add(30);
		l.add(12);
		l.add(78);
		l.add(32);
		System.out.println(l);
		
		
		
		
		

	}

}

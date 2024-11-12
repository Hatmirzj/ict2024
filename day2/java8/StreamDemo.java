package com.ict.day2.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course{
	Integer id;
	String name;
	Integer duration;
	public Course(Integer id, String name, Integer duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	
	
	
}

public class StreamDemo {

	public static void main(String[] args) {
		 List<Integer> list=Arrays.asList(4,4,3,6,6,10,7,8,92,3,4,1,5,6);
		 
		 list.stream().distinct().limit(10).filter(a->a%2==0).map(x->x*x).forEach(x->System.out.print(" "+x));
		   
		 Stream s=Stream.of(4,4,5,5,6,7,8,3,4,2);
		 s.distinct().skip(3).forEach(System.out::println);
		// s.forEach(x->System.out.println(x));
		 
		 list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		 List<Integer> sqlist=list.stream().limit(4).map(x->x*x).collect(Collectors.toList());
	     sqlist.forEach(x->System.out.println(" "+x));

	  List<Course> clist=new ArrayList();
	  clist.add(new Course(23,"java",4));
	  clist.add(new Course(34,"python",3));
	  clist.add(new Course(12,"spring",3));
	  
	  clist.stream().forEach(System.out::println);
	  clist.stream().map(c->c.name).filter(x->x.equals("java")).forEach(System.out::println);
	
	  
	  List<String> cityList=Arrays.asList("Arusha","Dodoma","Darusealam");
	  cityList.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	  cityList.stream().map(x->x.length()).forEach(System.out::println);
		
	  
	  
	  
	}
	

}

package com.valtech.training.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.List;
import java.util.Map;

import com.valtech.training.day1.Point;

public class UtilsTest {
	
	public static void testStack(Stack<Point> points) {
		points.push(new Point(2,3));
		points.push(new Point(2,4));
		points.push(new Point(2,3));
		points.push(new Point(2,5));
		System.out.println("Size = "+points.size());
		System.out.println(points.peek());
		System.out.println(points.pop());
	}
	
	public static void testMap(Map<String,Point> points) {
		points.put("2,3", new Point(2,3));
		points.put("2,3", new Point(2,3));
		points.put("3,2", new Point(3,2));
		points.put("4,2", new Point(2,4));
		System.out.println(points.size());
		System.out.println(points);
	}
	
	public static void testList(List<Point> points) {
		Point p = new Point(2,3);
		Point p1 = new Point(2,3);
		points.add(p);
		points.add(p1);
		points.add(p);
		points.add(new Point(3,2));
		points.add(new Point(2,4));
		points.add(new Point(4,2));
		System.out.println("Size = "+points.size());
		System.out.println(points);

	}
	
	//public static void testHashSet(Set<Point> points) {
		//Point p = new Point(2,3);
//		Point p1 = new Point(2,3);
//		points.add(p);
//		points.add(p1);
//		points.add(p);
//		points.add(new Point(3,2));
//		points.add(new Point(2,4));
//		points.add(new Point(4,2));
//		System.out.println("Size = "+points.size());
//		System.out.println(points);
//	}
	
	

	
	public static void main(String[] args) {
		//testHashSet(new HashSet<>());
		//testHashSet(new TreeSet<>());
		//testList(new ArrayList<>());
		//testList(new LinkedList<>());
		//testMap(new HashMap<>());
		//testMap(new TreeMap<>());
		testStack(new Stack<>());

	}

}

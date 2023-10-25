package com.valtech.training.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
	

	
	private int id;
	private String name;
	private int age;
	private int experience;
	private int seniority;
	private int salary;
	
	public Employee() {}
	
	public Employee(  String name, int age, int experience,int seniority, int salary) {
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
	}
	
	
	
	public Employee( int id, String name, int age, int experience,int seniority, int salary) {
		this.id = id;
		this.seniority = seniority;
		this.experience = experience;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", seniority="
				+ seniority + ", salary=" + salary + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeniority() {
		return seniority;
	}
	
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return 0;
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Employee(int seniority, int experience, String name, int age, double salary) {
//		this.seniority = seniority;
//		this.experience = experience;
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//
//	}
//
//	public int getSeniority() {
//		return seniority;
//
//	}
//
//	public int getExperience() {
//		return experience;
//
//	}
//
//	public String getName() {
//		return name;
//
//	}
//
//	public int getAge() {
//		return age;
//
//	}
//
//	public double getSalary() {
//		return salary;
//
//	}
//
//	@Override
//	public int compareTo(Employee o) {
//		if (this.seniority != o.seniority) {
//			return o.seniority-this.seniority ;
//		} else if (this.experience != o.experience) {
//			return this.experience - o.experience;
//		} else if (!this.name.equals(o.name)) {
//			return this.name.compareTo(o.name);
//		} else {
//			return o.age - this.age;
//		}
//	}
//
//	@Override
//	public String toString() {
//		return "Employee{" +"seniority= " + seniority +", experience= " + experience +", name= " + name +", age= " + age +", salary= " + salary +"}";
//
//	}
//
//}

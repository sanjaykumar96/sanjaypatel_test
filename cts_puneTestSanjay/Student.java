package com.cts.testmarch3;

public class Student {
	String name;
	int grades;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}

	public Student(String name, int grades) {
		super();
		this.name = name;
		this.grades = grades;
	}

	public Student() {
		
	}
}

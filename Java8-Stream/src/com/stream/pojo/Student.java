package com.stream.pojo;

public class Student {

	private String rollNum;

	private String name;

	private String city;

	private String state;

	private int marks;

	public Student(String rollNum, String name, String city, String state, int marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.city = city;
		this.state = state;
		this.marks = marks;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

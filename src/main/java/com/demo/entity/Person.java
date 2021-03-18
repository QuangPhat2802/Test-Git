package com.demo.entity;

public class Person {

	private int personId;
	private String first_Name;
	private String last_Name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String first_Name, String last_Name) {
		this.personId = personId;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID " + personId + " firstName " + first_Name + " lastName " + last_Name;
	}

}

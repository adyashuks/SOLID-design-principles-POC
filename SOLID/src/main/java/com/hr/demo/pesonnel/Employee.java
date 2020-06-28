package com.hr.demo.pesonnel;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private int monthlyIncome;
	private int nbHoursPerWeek;
	
	
	public Employee(String fullName, int monthlyIncome) {
		super();
		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
		setMonthlyIncome(monthlyIncome);
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getMonthlyIncome() {
		return monthlyIncome;
	}


	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}


	public int getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	public void setNbHoursPerWeek(int nbHoursPerWeek) {
		this.nbHoursPerWeek = nbHoursPerWeek;
	}
	
	public String getEmail() {
		return this.firstName + "." + this.lastName + "@demosolutions.com";
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.monthlyIncome;
	}
}

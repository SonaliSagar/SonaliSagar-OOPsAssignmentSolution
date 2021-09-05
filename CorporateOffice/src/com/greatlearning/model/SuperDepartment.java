package com.greatlearning.model;

public class SuperDepartment {
	protected String departmentName;
	protected String todaysWork;
	protected String workDeadline;
	
	// default constructor 
	public SuperDepartment() {
		// TODO Auto-generated constructor stub
	}
		
	public String departmentName() {
		this.departmentName = "Super Department ";
		return this.departmentName;
	}
	
	public String getTodaysWork() {
		this.todaysWork = "No Work as of now";
		return this.todaysWork;
	}
	
	public String getWorkDeadline() {
		this.workDeadline = "Nil";
		return this.workDeadline;
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
}

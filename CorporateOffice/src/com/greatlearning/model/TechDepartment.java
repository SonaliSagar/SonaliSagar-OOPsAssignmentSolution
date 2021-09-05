package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {

	String techStackInformation = "Core Java";
	
	public TechDepartment() {
		super();// TODO Auto-generated constructor stub
	}
	
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		super.departmentName = "Tech Department";
		return super.departmentName;
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		super.todaysWork = "Complete coding of module 1";
		return super.todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		super.workDeadline = "Complete by EOD";
		return super.workDeadline;
	}

	public String getTechStackInformation() {
		return techStackInformation;
	}
		
}

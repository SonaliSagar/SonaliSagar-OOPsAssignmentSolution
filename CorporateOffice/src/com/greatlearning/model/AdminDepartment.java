package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		super.departmentName = "Admin Department";
		return super.departmentName;
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		super.todaysWork = "Complete your documents Submission";
		return super.todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		super.workDeadline = "Complete by EOD ";
		return super.workDeadline;
	}
}

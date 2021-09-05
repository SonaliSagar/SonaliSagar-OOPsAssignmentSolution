package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {

	public String activity = "team Lunch";

	public HrDepartment() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		super.departmentName = "HR Department";
		return super.departmentName;
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		super.todaysWork = "Fill today’s worksheet and mark your attendance";
		return super.todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		super.workDeadline = "Complete by EOD";
		return super.workDeadline;
	}
	
	public String doActivity() {
		return this.activity;
	}

}

package com.greatlearning.main;
import com.greatlearning.model.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of Admin department 
		SuperDepartment adm = new AdminDepartment();
		System.out.println("Welcome to " + adm.departmentName());
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday());
		
		System.out.println();
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		
		System.out.println();
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());	
		
	}
}

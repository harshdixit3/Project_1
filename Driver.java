package com.greatleaning.project_1;

public class Driver {
	public static void main(String[] args) {

		SuperDepartment superDepartment = new SuperDepartment();

		Admin_Department admin_Department = new Admin_Department();
		
		admin_Department.departmentName();
		admin_Department.getTodaysWork();
		admin_Department.getWorkDeadline();
		superDepartment.isTodayAHoliday();

		HrDepartment hrDepartment = new HrDepartment();
		System.out.println();
		hrDepartment.departmentName();
		hrDepartment.doActivity();
		hrDepartment.getTodaysWork();
		hrDepartment.getWorkDeadline();
		superDepartment.isTodayAHoliday();

		Tech_department tech_department = new Tech_department();
		System.out.println();
		tech_department.departmentName();
		tech_department.getTodaysWork();
		tech_department.getWorkDeadline();
		tech_department.getTechStackInformation();
		superDepartment.isTodayAHoliday();
	}

}

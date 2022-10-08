package com.greatlearning.corejava;

public class Main {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcom to" + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		HRDepartment hr = new HRDepartment();
		System.out.println("\nWelcom to" + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		TechDepartment tech = new TechDepartment();
		System.out.println("\nWelcom to" + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}

package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		//System.out.println(employee.salary);
		//employee.salary=-4000;
		employee.setSalary(-2000);
		int empSalary = employee.getSalary();
		//empSalary contain 6000, 0
		System.out.println("Employee Salary>>" + empSalary);
	}
}

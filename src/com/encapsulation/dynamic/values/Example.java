package com.encapsulation.dynamic.values;

import java.util.Scanner;

public class Example {
	// studentId, studentName, studentCity
		public void getStudentInfo() {
			System.out.println("Enter Student ID>>"); //10
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			System.out.println("Enter Student Name>>"); //sandip
			String name = scanner.next();
			System.out.println("Enter Student City"); //pune
			String city = scanner.next();

			// Q.How to set/store values into stud object
			Student stud = new Student();
			// A- use setter method
			stud.setStudentId(id); //10
			stud.setStudentName(name); //sandip
			stud.setStudentCity(city); //pune
			// Q.How to get values from stud object
			// A- use getter method
			// System.out.println("ID>>"+stud.getStudentId());
			int sId = stud.getStudentId(); //10
			System.out.println("Student ID>>" + sId);
			String sName = stud.getStudentName(); //sandip
			System.out.println("Student Name>>" + sName);
			String sCity = stud.getStudentCity(); //pune
			System.out.println("Student City>>" + sCity);
		}

		public static void main(String[] args) {
			Example example = new Example();
			example.getStudentInfo();
		}

}

package com.encapsulation.dynamic.values;

public class Student {
	// studentId, studentName, studentCity
		private int studentId; //10
		private String studentName; //sandip
		private String studentCity; //pune

		//generate getter and setter method
		public int getStudentId() {
			return studentId; //10
		}

		public void setStudentId(int studentId) { //10
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) { //sandip
			this.studentName = studentName;
		}

		public String getStudentCity() {
			return studentCity;
		}

		public void setStudentCity(String studentCity) { //pune
			this.studentCity = studentCity;
		}

}

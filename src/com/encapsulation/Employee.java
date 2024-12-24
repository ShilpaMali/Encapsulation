package com.encapsulation;

public class Employee {

	private int salary;        //6000, 0
                               //setter method
public void setSalary(int sal) { // 6000 , -2000
if (sal > 0) {               //6000>0- Condition-True
                            //-2000>0 - Condition-False
salary=sal;                 //assigning 6000 to salary variable
} else {
salary=0;                   //assigning 0 value to salary variable
}
}

//Design method which return salary to that method
//getter method
public int getSalary() {
return salary;
//6000 value return to getSalary() method
//0 value return to getSalary() method
	}

}

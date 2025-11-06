package org.sample;

public class Employee {
	int employeeNum;
	String employeeName;
	public Employee(int employeeNum, String employeeName) {
		
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
	}
	public Employee(int employeeNum) {
		super();
		this.employeeNum = employeeNum;
	}
	@Override
	public String toString() {
		return "Employee [employeeNum=" + employeeNum + ", employeeName=" + employeeName + "]";
	}
	
}

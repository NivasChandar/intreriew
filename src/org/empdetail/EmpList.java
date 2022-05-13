package org.empdetail;

public class EmpList {
	private void empId() {
		System.out.println("emp id : 987");
	}
	private void empName() {
		System.out.println("emp name : nivas");
		System.out.println("emp dob : 09/09");
	}
	public static void main(String[] args) {
		
		EmpList learn =new EmpList();
		learn.empId();
		learn.empName();
		}
}

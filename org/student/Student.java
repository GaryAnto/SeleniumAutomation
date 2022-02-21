package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("Gary.A");
     }
    public void studentDept() {
    	System.out.println("ECE");
    }
    public void studentId() {
    	System.out.println("412217106015");
    }
     public static void main(String[] args) {
		Student details=new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.deptName();
		details.studentId();
		details.studentDept();
		details.studentName();
	}

}


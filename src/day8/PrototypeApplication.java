package day8;

import java.util.Scanner;

public class PrototypeApplication {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
			int employeeID = sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
			String empName = sc.next();
		
		System.out.println("Enter Employee Designation : ");
			String designation = sc.next();
			
			EmployeeDetails refEmployeeDetails1 = new EmployeeDetails();
			refEmployeeDetails1.setEmpID(employeeID);
			refEmployeeDetails1.setEmpName(empName);
			refEmployeeDetails1.setDesignation(designation);
			refEmployeeDetails1.showRecord();
			
			
			//cloning object
			
			EmployeeDetails refEmployeeDetails2 = (EmployeeDetails) refEmployeeDetails1.clone();
			//no heap memory is being used as no new keyword is used
			//clone image of object
			refEmployeeDetails2.showRecord();

	}
}

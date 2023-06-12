package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
	
	public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)

		private long empid;
		private String empname;
		private int salary;
		public Employee(int empid, String empname, int salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getEmpid() {
			return empid;
		}
		public void setEmpid(long empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
		}
		
		

	
}

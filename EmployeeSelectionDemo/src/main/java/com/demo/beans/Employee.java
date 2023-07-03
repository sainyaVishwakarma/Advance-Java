package com.demo.beans;

public class Employee {
	private int empno;
	private String ename;
	private int deptno;
	private int sal;

	public Employee() {
		super();
	}

	public Employee(int empno, String ename, int deptno, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + ", sal=" + sal + "]";
	}

}

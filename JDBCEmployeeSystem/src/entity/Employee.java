package entity;

public class Employee {
	
	private int empid;
	private String ename;
	private String eadd;
	private String eloc;
	private int deptid;
	
	public Employee() {}
	
	public Employee(String ename, String eadd, String eloc, int deptid) {
		super();
		this.ename = ename;
		this.eadd = eadd;
		this.eloc = eloc;
		this.deptid = deptid;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public String getEloc() {
		return eloc;
	}

	public void setEloc(String eloc) {
		this.eloc = eloc;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", eadd=" + eadd + ", eloc=" + eloc + ", deptid="
				+ deptid + "]";
	}

	
}

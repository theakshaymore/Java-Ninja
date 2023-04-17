package entity;

public class Department {
	
	private String deptid;
	private String deptname;
	
	public Department() {}
	
	public Department(String deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptid() {
		return deptid;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	
}

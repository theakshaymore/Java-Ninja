package entity;

public class Employee {
	private int eId, deptId;
	private String eName, eAdd;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, int deptId, String eName, String eAdd) {
		super();
		this.eId = eId;
		this.deptId = deptId;
		this.eName = eName;
		this.eAdd = eAdd;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAdd() {
		return eAdd;
	}
	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", deptId=" + deptId + ", eName=" + eName + ", eAdd=" + eAdd + "]";
	}
	
}

package day23;

public class UserInfo {
	
	private int id, amount, mobile;
	private String name;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int id, int amount, int mobile, String name) {
		super();
		this.id = id;
		this.amount = amount;
		this.mobile = mobile;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", amount=" + amount + ", mobile=" + mobile + ", name=" + name + "]";
	}
	
	
}

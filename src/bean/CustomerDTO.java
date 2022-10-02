package bean;

public class CustomerDTO {
	
	private int accnum;
	private String name;
	private int mobnum;
	private String address;
	private int balance;
	private String password;
	
	
	public CustomerDTO(int accnum, String name, int mobnum, String address, int balance, String password) {
		super();
		this.accnum = accnum;
		this.name = name;
		this.mobnum = mobnum;
		this.address = address;
		this.balance = balance;
		this.password = password;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobnum() {
		return mobnum;
	}
	public void setMobnum(int mobnum) {
		this.mobnum = mobnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CustomerDTO [AccountNumber=" + accnum + ", name=" + name + " address"+ address + "balance"+ balance+ "]";
	}


}

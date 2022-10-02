package bean;

public class Customer {
	
	
	private int accnum;
	private String name;
	private int balance;
	private String password;
	
	
	public Customer(int accnum, String name, int balance, String password) {
		super();
		this.accnum = accnum;
		this.name = name;
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
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer[AccountNumber=" + accnum + ", name=" + name + " address"+ address + "balance"+ balance+ "]";
	}

}

package dao;
import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Accountant;
import bean.Customer;
import bean.CustomerDTO;
import exception.CustomerException;
import utility.dbUtility;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String registerCustomer(String name, int balance, String password) {
		
	String message = "Not Inserted..";
	
		
	
		
		try(Connection conn= dbUtility.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into student(name,balance,password) values(?,?,?)");
			
			
			
			ps.setString(1, name);
			ps.setInt(2, balance);
			ps.setString(4, password);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Student Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String registerCustomer2(Customer customer) {
		
		String message = "Not Inserted..";
	
		
	
		
		try(Connection conn= dbUtility.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into student(name,balance,password) values(?,?,?)");
			
			
			
			ps.setString(1, customer.getName());
			ps.setInt(2, customer.getBalance());
			ps.setString(4, customer.getPassword());
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Customer Account Created Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	
	}

	@Override
	public Customer getCustomerbyacc(int accnum) throws CustomerException {
		
		Customer customer =null;
		
		
		try (Connection conn= dbUtility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from customer where accnum=?");
			
			
			ps.setInt(1, accnum);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				int m= rs.getInt("balance");
				String p= rs.getString("password");
				
				
			customer =new Customer(r, n, m, p);	
				
				
			}else
				throw new CustomerException("Customer does not exist with Acc Num "+accnum);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			throw new CustomerException(e.getMessage());
			
			
		}
		
		return customer;
	

	}

	@Override
	public Customer loginCustomer(String username, String password) throws CustomerException {
		
		Customer customer = null;
		
		try(Connection conn = dbUtility.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from customer where name = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int a= rs.getInt("accnum");
				String n= rs.getString("name");
				int b= rs.getInt("balance");
				String p= rs.getString("password");
				
				
			customer=new Customer(a, n, b, p);	
				
				
			}else
				throw new CustomerException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new CustomerException(e.getMessage());
		}
		
		return customer;
		
	
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		
		List<Customer> customers= new ArrayList<>();
		
		
		try(Connection conn= dbUtility.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from customer");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int a= rs.getInt("accnum");
				String n= rs.getString("name");
				int b= rs.getInt("balance");
				String p= rs.getString("password");
				
				
			Customer customer =new Customer(a, n, b, p);	
				
			customers.add(customer);
						
			}
		
			
		} catch (SQLException e) {
			throw new CustomerException(e.getMessage());
		}
		
		
		if(customers.size() == 0)
			throw new CustomerException("No Student found..");
		
		return customers;

	}

	public void loginAccountant(String username, String password) {
		
		if(Accountant.uname==username && Accountant.password==password)
		{
			
			System.out.println("Accountant Log In Successful!!");
		}
		else
		{
			System.out.println("Invalid credentials!!");
		}
		
		
	}


}





	
}

package dao;

import java.util.List;

import bean.Accountant;
import bean.Customer;
import bean.CustomerDTO;
import exception.AccountantException;
import exception.CustomerException;

public interface CustomerDao {
	

		
		public String registerCustomer(String name,int balance,String passwrod);

		public String registerCustomer2(Customer customer);
		
		public Customer getCustomerbyacc(int accnum)throws CustomerException;

		
		public Customer loginCustomer(String username, String password)throws CustomerException;
		
		public static void loginAccountant(String username, String password);
		
		public List<Customer> getAllCustomerDetails()throws CustomerException;
		
		
		
	}


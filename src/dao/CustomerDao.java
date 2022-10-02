package dao;

import exception.CustomerException;

public interface CustomerDao {
	

		
		public String registerCustomer(String name,int balance,String email,String passwrod);

		public String registerCustomer2(Customer customer);
		
		public Customer getCustomerbyacc(int acc)throws CustomerException;

		
		public Customer loginCustomer(String username, String password)throws CustomerException;
		
		
		public List<Customer> getAllCustomerDetails()throws CustomerException;
		
		
		public List<CustomerDTO> getAllCustomerByaccnum(int accnum)throws CustomerException;
		
		
		
	}

}

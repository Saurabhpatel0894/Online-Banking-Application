package useCases;

import java.util.Scanner;

import bean.Customer;
import dao.CustomerDao;
import exception.CustomerException;

public class logInCustomer {
	
public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			Customer customer= dao.loginCustomer(uname, pass);
		
	 		System.out.println("LogIn Successfull :"+customer.getName());
	 	
	 	
		}catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		

}

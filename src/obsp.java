import java.util.Scanner;

import dao.CustomerDaoImpl;
import exception.CustomerException;

public class obsp {
	
	public static void selectOption() throws CustomerException
	{
		System.out.println("Please select an option : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Login as Customer");
		System.out.println("2 : Login as Accountant");
		int n = sc.nextInt();
		CustomerDaoImpl cdi = null;
		
		switch(n)
		{
		case 1:
			System.out.println("Enter Username : ");
			String cname = sc.next();
			System.out.println("Enter Password : ");
			String cpassword = sc.next();
			
			cdi.loginCustomer(cname, cpassword);
			
			
			break;
		case 2:
			System.out.println("Enter Username : ");
			String aname = sc.next();
			System.out.println("Enter Password : ");
			String apassword = sc.next();
			cdi.loginAccountant(aname,apassword);
			
		}
	}

}
